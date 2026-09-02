package br.com.senai.patrimonio;

import br.com.senai.patrimonio.avaliacao.Participante;
import br.com.senai.patrimonio.avaliacao.enums.Nivel;
import br.com.senai.patrimonio.model.Empresa;
import br.com.senai.patrimonio.model.Endereco;
import br.com.senai.patrimonio.model.Funcionario;
import br.com.senai.patrimonio.model.Sala;
import br.com.senai.patrimonio.model.enums.Cargo;
import br.com.senai.patrimonio.model.enums.Pagamento;
import br.com.senai.patrimonio.model.enums.PagamentoComposto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatrimonioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatrimonioApplication.class, args);


		/*Empresa empresa = new Empresa();
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

		Sala sala= new Sala();

		Funcionario funcionario = new Funcionario(35L,"Mariazinha",
				"123456789", Cargo.GERENTE,empresa,sala
		);

		System.out.println(funcionario.getCpf());
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCargo());
		System.out.println(funcionario.getEmpresa());
		System.out.println(funcionario.getSalasResponsavel());
		System.out.println(funcionario.getId());


		System.out.println(Pagamento.PIX);
		System.out.println(PagamentoComposto.PIX.getDescricao());
		System.out.println(PagamentoComposto.PIX);
		System.out.println(PagamentoComposto.PIX.getSituacao());
		System.out.println(PagamentoComposto.CARTAO_CREDITO);
		System.out.println(PagamentoComposto.CARTAO_CREDITO.getSituacao());
		System.out.println(PagamentoComposto.CARTAO_DEBITO);
		System.out.println(PagamentoComposto.CARTAO_DEBITO.getSituacao());
		System.out.println(PagamentoComposto.BOLETO);
		System.out.println(PagamentoComposto.BOLETO.getSituacao());
		System.out.println(PagamentoComposto.PERMUTA);
		System.out.println(PagamentoComposto.PERMUTA.getSituacao());
		System.out.println(PagamentoComposto.DINHEIRO);
		System.out.println(PagamentoComposto.DINHEIRO.getSituacao()
		);*/


		Participante participante= new Participante("Mikelvski","mikilos@gmail.com",
				"00223344","SE058877", Nivel.AVANCADO);



	}



}
