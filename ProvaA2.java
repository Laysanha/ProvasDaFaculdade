package a1_primeiro_prova;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

//Faça um programa para a apuração dos votos para prefeito em uma eleição.
//Para isso deve ser possível digitar o partido, o nome e a quantidade de votos de N candidatos.
//Ao final o programa deve informar o nome e partido do candidato que obteve mais votos bem 
//como o percentual de votos desse candidato em relação ao total de votos.

public class ProvaA2 {
	public static void main(String[] args) {

		String maiorNome = "";
		String maiorPartido = "";
		double percentual = 0.0;
		double maiorVoto = 0.0;
		int votoTotal = 0;

		int candit = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Informe quantos candidados estão na eleição:"));

		for (int i = 0; i < candit; i++) {
			String nome = JOptionPane.showInputDialog("Informe o nome do candidato(a): ");
			String partido = JOptionPane.showInputDialog("Informe o nome do partido: ");

			double voto = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de votos"));
			votoTotal += voto;

			if (i == 0) {
				maiorVoto = voto;
				maiorNome = nome;
				maiorPartido = partido;
			} else if (voto > maiorVoto) {
				maiorVoto = voto;
				maiorNome = nome;
				maiorPartido = partido;
			}
		}
		DecimalFormat df = new DecimalFormat("###.##");
		percentual = (double) ((maiorVoto * 100) / votoTotal);
		String formatPercentual = df.format(percentual);

		JOptionPane.showMessageDialog(null,
				" Nome do partido com maior voto: " + maiorPartido + "\n" + "\n Candidato com mais votos: " + maiorNome
						+ "\n Número de votos: " + maiorVoto + "\n"
						+ "\n Percentual de votos em relação ao total de votos: " + formatPercentual + "%");
	}
}
