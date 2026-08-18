package br.com.senai.patrimonio;

import br.com.senai.patrimonio.model.Empresa;
import br.com.senai.patrimonio.model.Endereco;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatrimonioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatrimonioApplication.class, args);


		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Senai LTDA");
		System.out.println(empresa.getRazaoSocial());

		Endereco endereco=new Endereco();
		endereco.setRua("R. Gen. Lauro Sodré, ");
		endereco.setNumero("300");
		endereco.setComplemento("Blocos");
		endereco.setBairro("Comerciario");
		endereco.setCidade("Criciúma");
		endereco.setEstado("Santa Catarina");
		System.out.print(endereco.getRua());
		System.out.println(endereco.getNumero());
		System.out.println(endereco.getComplemento());
		System.out.println(endereco.getBairro());
		System.out.println(endereco.getCidade());
		System.out.println(endereco.getEstado());

		empresa.setEndereco(endereco);
		System.out.println(empresa.getEndereco().getRua());

		System.out.println("******************\n");
		Endereco enderecocomArgumento=new Endereco("Archangelo Meller, ","1432","casa","Mineira Velha","Criciúma",",SC");
		System.out.print(enderecocomArgumento.getRua());
		System.out.println(enderecocomArgumento.getNumero());
		System.out.println(enderecocomArgumento.getComplemento());
		System.out.println(enderecocomArgumento.getBairro());
		System.out.print(enderecocomArgumento.getCidade());
		System.out.println(enderecocomArgumento.getEstado());


	}



}
