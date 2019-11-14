package br.com.cadastros;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.atendimentos.Menu;

public class Acoes implements Serializable {
	public List<PetSitter> petSitters = new ArrayList<PetSitter>();
	public List<Pet> pets = new ArrayList<Pet>();
	public List<Cliente> clientes = new ArrayList<Cliente>();
	transient Controle controle;
	transient Menu menu = new Menu();
	
	
	public void listarPetSitter() {
		if (petSitters.size() == 0) {
			System.out.println("Lista de PetSitters vazia!\n");
		}
		else {
			System.out.println("PetSitters Cadastrados");
			for (PetSitter c : petSitters) {
				System.out.println("Nome: " + c.getNome());
				System.out.println("Telefone: " + c.getTelefone());
				System.out.println("Endereço: " + c.getEndereço());
				System.out.println("CPF: " + c.getCpf() + "\n");
				
			}
		}
	}
	public void listarPet() {
		if (pets.size() == 0) {
			System.out.println("Lista de Pet vazia!\n");
		}
		else {
			System.out.println("Pets Cadastrados");
			for (Pet c : pets) {
				System.out.println("Raça: " + c.getRaça());
				System.out.println("Gênero: " + c.getGenero());
				System.out.println("Idade: " + c.getIdade() + "\n");
			}
		}
	}
	
	public void cadastrarPetSitter(Scanner scanner) {
		String nome, telefone, endereco, cpf;
		
		System.out.print("\nInsira o nome: ");
		scanner.nextLine(); // Adianta o leitor p/ realizar a prox. leitura.
		nome = scanner.nextLine(); // nextLine() lÃª strings com espaÃ§os.
		
		System.out.print("\nInsira o telefone: ");
		telefone = scanner.next();
		
		System.out.print("\nInsira o endereco: ");
		scanner.nextLine();
		endereco = scanner.nextLine();
		
		System.out.print("\nInsira o CPF: ");
		cpf = scanner.next();
		
		PetSitter novoPetSitter = new PetSitter(nome, telefone, endereco, cpf);
		
		petSitters.add(novoPetSitter);
		
		System.out.println("\nCadastro do PetSitter realizado com sucesso!");
	}
	
	public void cadastrarCliente(Scanner scanner) {
		String nome, telefone, endereco, cpf;
		
		System.out.print("\nInsira o nome: ");
		scanner.nextLine(); // Adianta o leitor p/ realizar a prox. leitura.
		nome = scanner.nextLine(); // nextLine() lÃª strings com espaÃ§os.
		
		System.out.print("\nInsira o telefone: ");
		telefone = scanner.next();
		
		System.out.print("\nInsira o endereco: ");
		scanner.nextLine();
		endereco = scanner.nextLine();
		
		System.out.print("\nInsira o CPF: ");
		cpf = scanner.next();
		
		Cliente novoCliente = new Cliente(nome, telefone, endereco, cpf);
		
		clientes.add(novoCliente);
		
		System.out.println("\nCadastro do cliente realizado com sucesso!");
		
		int opPet;
		System.out.println("Quantos animais voce deseja cadastrar?? Limite até 5 animais!!");
		opPet = scanner.nextInt();
		while(opPet > 5) {
			System.out.println("Você não pode cadastrar mais que 5 animais\n");
			System.out.println("Quantos animais voce deseja cadastrar?? Limite até 5 animais!!");
			opPet = scanner.nextInt();
		}
		for(int i = 0; i<=opPet; i++) {
			cadastrarPet(scanner);
		}		
}
	
	public void cadastrarPet(Scanner scanner) {
		
		System.out.println("Iniciando cadastro do PET..." );
		String raça, idade, genero;
		
		System.out.println("Entre com a raça do animal:");
		scanner.nextLine();
		raça = scanner.nextLine();
		System.out.println("Entre com a idade do animal:");
		scanner.nextLine();
		idade = scanner.nextLine();
		System.out.println("Entre com o genero do animal:");
		scanner.nextLine();
		genero = scanner.nextLine();
			
		Pet novoPet = new Pet(raça, idade, genero);
		pets.add(novoPet);
		System.out.println("\nCadastro do animal realizado com sucesso!");
	}		

	public void historicoAtendimento(Scanner scanner) {
		//codigo 
	}
	
	public void racasComuns() {
		
		System.out.println("############### Ranking das 10 Raças mais Comuns ##############");
		for (int i = 0; i<10; i++) {
			System.out.println(": ");
		}
		
		
		
		
	}
	
	public void RacaPorGenero(Scanner scanner) {
		scanner.nextLine();
		String raca;
		
		System.out.println("Escolha a raça:" );
		raca = scanner.nextLine();
		
		for (Pet c : pets) {
			System.out.println("Raça: " + c.getRaça());
			
		}
		
		
	}
	
	
	public void relatorios(Scanner scanner){
		menu.imprimirMenuRelatorios();
		
		int opRelatorio;
		System.out.println("\nEscolha a opção desejada:\n ");
		opRelatorio = scanner.nextInt();
		
		if (opRelatorio == 1) {
			racasComuns();
		}
		else if(opRelatorio == 2) {
			RacaPorGenero(scanner);
			
		}
		else {
			menu.imprimirMenu();
		}

	}
	
}	
			
			
			
			
			
			
			