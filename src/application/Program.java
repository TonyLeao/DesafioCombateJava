package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão:");
		
		System.out.print("Nome: ");		
		String name = sc.nextLine();
		
		System.out.print("Vida inicial: ");
		int initialLife = sc.nextInt();
		
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		
		Champion champion1 = new Champion(name, initialLife, attack, armor);
		
		System.out.println("\nDigite os dados do segundo campeão:");
		
		System.out.print("Nome: ");
		sc.nextLine();
		name = sc.nextLine();
		
		System.out.print("Vida inicial: ");
		initialLife = sc.nextInt();
		
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		
		Champion champion2 = new Champion(name, initialLife, attack, armor);
		
		System.out.print("\nQuantos turnos você deseja executar? ");
		int rounds = sc.nextInt();
		
		for (int i = 1; i <= rounds; i++) {
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);
			
			System.out.println("\nResultado do turno " + i + ":");						
			System.out.println(champion1.status());
			System.out.println(champion2.status());
			
			if (champion1.getLife() == 0 || champion2.getLife() == 0) {
				break;
			}
		}
		
		System.out.println("\nFIM DO COMBATE");
		
		sc.close();
	}

}
