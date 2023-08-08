package com.karen.PrincipalConversorMoneda;

import javax.swing.*;

import com.karen.ChallengeONEJava.OpcionesConversion;
import com.karen.conversortemperatura.OpcionesConversionTemperatura;

public class Principal {
	
	public static void main(String[] args) {
		
		OpcionesConversion conversion = new OpcionesConversion();
		OpcionesConversionTemperatura conversionT = new OpcionesConversionTemperatura();
		
		while(true) {
			String opciones = JOptionPane.showInputDialog(null,"Selecione la opcion que desea convertir", "Menu",
					JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de monedas","Conversor de temperatura"},
					"Elegir") .toString();
			
			switch(opciones) {
			case "Conversor de monedas":
				String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversion");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("");
				}else {
					JOptionPane.showConfirmDialog(null, "Programa Finalizado");
				}break;
				
			case "Conversor de temperatura":
				String input1 = JOptionPane.showInputDialog(null, "Ingrese la temperatura a convertir");
				double valorRecibidoT = Double.parseDouble(input1);
				conversionT.ConversionTemperaturas(valorRecibidoT);
				
				int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversion?");
				if(JOptionPane.OK_OPTION == respuestaT) {
					System.out.println("");
				}else {
					JOptionPane.showConfirmDialog(null, "Programa Finalizado");
				}break;
			
				
			}
			
			}
		
			

		}

}
