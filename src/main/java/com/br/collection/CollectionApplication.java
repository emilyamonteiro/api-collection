package com.br.collection;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionApplication.class, args);
	}

	@RequestMapping("/")
	String veiculo(){
		Carro meuCarro = new Carro();
		meuCarro.anoDeFabricacao = 2021;
		meuCarro.cor = "PRETO";
		meuCarro.fabricante = "HONDA";
		meuCarro.modelo = "HR-V";

		Usuario usuario = new Usuario();
		usuario.nome = "MICHEL";
		usuario.email = "michelhotz";

		meuCarro.usuario = usuario;

		Endereco endereco = new Endereco();
		endereco.rua = "RUA R T";
		endereco.endereco = "GLICERIO";
		endereco.cep = "27985-000";

		usuario.endereco = endereco;



		Gson gson = new Gson();

		String json = gson.toJson(meuCarro);

		return json;
	}

}
