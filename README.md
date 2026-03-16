# dsI-maria-freitas
Aulas de Desenvolvimento De Software I com o professor João Silles.
# Como Configurar o Java

1.  **Instalação do JDK**: Instalei o Java da  [Adoptium (Temurin)](https://adoptium.net/)
2.  **Configuração no VS Code**:
    -   Instale o  _Extension Pack for Java_  da Microsoft
    -   Configure o path do Vscode para reconhecer o JDK da Adoptium nas configurações 
    - prontinho!
    - `java.jdt.ls.java.home`

# Regras do Java

-   **Letras maiúsculas**: diferencia as letras maiúsculas de minúsculas, onde o  `Main` precisa ser maiúsculo
-   **Nomes dos Arquivos**: O nome do arquivo deve ser exatamente igual ao nome da classe pública >>(ex:  `Main.java`  para a classe  `Main`).<<
# Funcionamento do Java

`Main.java`:

```
package aula01; //define q pertence a pasta aula01

public  class  Main {  //caracteriza o arquivo, onde declara sua classe e seu nome (main)
	public  static  void  main(String[] args) {
		System.out.println("Hello World"); //exibe a frase na tela
	}
}
```

## Configurando o git ⚙️

1.  **Instalando o GitBash**: Clique no  [Git](https://git-scm.com/install/windows);
2.  **Comandos do GitBash**:
````
git config --global user.name 'M Carolina Sayo O Freitas'
git config --global user.email astersmistake@gmail.com

git config --global --list

credencial GitHub: remover caso não tenha seu nome