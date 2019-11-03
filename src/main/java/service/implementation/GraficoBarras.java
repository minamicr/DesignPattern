package service.implementation;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import service.Observer;

public class GraficoBarras implements Observer {

	DefaultCategoryDataset dataset;
	JFrame frame = new JFrame();
	
	public void mudancaQuantidade(String acao, Integer quantidade) {
		dataset.setValue(quantidade, "Quantidade", acao);
	}

	public GraficoBarras() {
		dataset = new DefaultCategoryDataset();
		JFreeChart chart = ChartFactory.createBarChart(
				"Carteira de Ações"
				, "Siglas"
				, "Quantidade"
				, dataset
				, PlotOrientation.VERTICAL
				, false
				, true
				, false);
		
			
		ChartPanel chartPanel = new ChartPanel(chart);
		frame.setContentPane(chartPanel);
		frame.setSize(500, 270);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
