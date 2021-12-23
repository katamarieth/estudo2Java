programa
{
	
	funcao inicio()
	{
		cadeia nomes[]={"Katha","Maria","Oscar","Pedro","Cesar"}
		real altura[]={1.64,1.70,1.80,2.00,1.74}
		escreva("-------------------")
		escreva("------TABELA-------")
		escreva("-------------------")

		para (inteiro posicao = 0;posicao <= 4; posicao++)
		{ 
			escreva ("\n", nomes[posicao], "\t\t", altura[posicao],"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */