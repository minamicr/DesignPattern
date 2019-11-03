package com.minami.DesignPattern;

import java.util.Observer;

import model.CarteiraAcoes;
import service.implementation.AcoesLogger;
import service.implementation.DivisionOperation;
import service.implementation.GraficoBarras;
import service.implementation.MultiplicationOperation;
import service.implementation.SubtractionOperation;
import service.implementation.SumOperation;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
		generateGraphs();
		
    }
    
    private void calculatorOperations(String[] args) {
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		
		DivisionOperation division = new DivisionOperation();
		MultiplicationOperation multiplication = new MultiplicationOperation();
		SubtractionOperation subtraction = new SubtractionOperation();
		SumOperation sum = new SumOperation();
		
		System.out.println(String.format("a / b = %s", division.calculate(a, b)) );
		System.out.println(String.format("a * b = %s", multiplication.calculate(a, b)));
		System.out.println(String.format("a - b = %s", subtraction.calculate(a, b)));
		System.out.println(String.format("a + b = %s", sum.calculate(a, b)));
    }
    
    private static void generateGraphs() throws Exception {
    	GraficoBarras gb = new GraficoBarras();
    	AcoesLogger al = new AcoesLogger();
    	CarteiraAcoes c = new CarteiraAcoes();
    	
    	c.addObserver(gb);
    	c.addObserver(al);
    	
    	Thread.sleep(2000);
    	c.adicionaAcoes("COMPO2",  200);
    	Thread.sleep(2000);
    	c.adicionaAcoes("EMP34",  400);
    	Thread.sleep(2000);
    	c.adicionaAcoes("ACDF89",  300);
    	Thread.sleep(2000);
    	c.adicionaAcoes("EMP34",  -200);
    	Thread.sleep(2000);
    	c.adicionaAcoes("COMPO2", 150);
    }
}
