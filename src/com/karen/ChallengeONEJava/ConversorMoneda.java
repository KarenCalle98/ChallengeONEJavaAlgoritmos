package com.karen.ChallengeONEJava;

import javax.swing.JOptionPane;

public class ConversorMoneda {
	
	public void ConvertirPesosColombianosDolares(double valor) {
		double monedaDolar = valor / 4000;
		monedaDolar = (double)Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar  + "Dolares");
	}
	public void ConvertirPesosColombianosEuros(double valor) {
		double monedaEuros = valor / 4400;
		monedaEuros = (double)Math.round(monedaEuros* 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaEuros  + "Euros");
	}
	public void ConvertirPesosColombianosLibrasEsterlinas(double valor) {
		double monedaLibrasEsterlinas = valor / 5100;
		monedaLibrasEsterlinas = (double)Math.round(monedaLibrasEsterlinas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaLibrasEsterlinas  + "Libras Esterlinas");
	}
	public void ConvertirPesosColombianosYenJaponés(double valor) {
		double monedaYenJaponés = valor / 2800;
		monedaYenJaponés = (double)Math.round(monedaYenJaponés * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaYenJaponés + "Yen Japonés");
	}
	public void ConvertirPesosColombianosWonsulcoreano(double valor) {
		double monedaWonsulcoreano = valor / 3000;
		monedaWonsulcoreano = (double)Math.round(monedaWonsulcoreano * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaWonsulcoreano  + "Won sul-coreano");
	}
	
	
	public void ConvertirDolaresPesosColombianos(double valor) {
		double monedaDolar = 4000 * valor ;
		monedaDolar = (double)Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes Dolares" + monedaDolar  + "en pesos");
	}
	public void ConvertirEurosPesosColombianos(double valor) {
		double monedaEuros = valor * 4400;
		 monedaEuros = (double)Math.round( monedaEuros * 100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes Euros" +  monedaEuros + "en pesos");
	}
	public void ConvertirLibrasEsterlinasPesosColombianos(double valor) {
		double monedaLibrasEsterlinas = valor *  5100;
		monedaLibrasEsterlinas = (double)Math.round(monedaLibrasEsterlinas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes Libras Esterlinas" + monedaLibrasEsterlinas  + "en pesos");
	}
	public void ConvertirYenJaponésPesosColombianos(double valor) {
		double monedaYenJaponés = valor * 2800 ;
		monedaYenJaponés = (double)Math.round(monedaYenJaponés* 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes Yen Japonés" + monedaYenJaponés  + "en pesos");
	}
	public void ConvertirWonsulcoreanoPesosColombianos(double valor) {
		double monedaWonsulcoreano = valor * 3000;
		monedaWonsulcoreano = (double)Math.round(monedaWonsulcoreano * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes Won sul-coreano" + monedaWonsulcoreano + "en pesos");
	}

}
