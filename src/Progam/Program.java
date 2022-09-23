package Progam;

import java.util.Locale;
import java.util.Scanner;
import entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bill bill = new Bill();

		System.out.print("sexo: ");
		bill.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		System.out.println("Relatório:");
		System.out.println("");
		System.out.println("Consumo = R$ " + bill.feeding());
		System.out.println("Couvert = R$ " + bill.cover(bill.feeding()));
		System.out.println("Ingresso = R$ " + bill.ticket() );
		System.out.println("");
		System.out.println("Valor a pagar " + bill.total(bill.cover(bill.feeding()), bill.feeding(), bill.ticket() ));

		sc.close();

	}

}
