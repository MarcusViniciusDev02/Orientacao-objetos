# Aula Anotações
# Sobre ArrayList

Sempre utilizar um ArrayList por ser um vetor mais poderoso.

    ArrayList <Objeto> variavel = new ArrayList<>();
- Sintax de um array;
---
    variavel.add
- Adiciona um item ao array;
---
    variavel.remove(item);
- Remove um item do vetor baseado no índice ou valor;
---
    variavel.clear
- Limpa todo o array;
---

# Getters, Setters e Construtores:

## Visibilidade e métodos especiais

### Privado 
- Apenas a classe tem acesso a aquele atributo. 
---
### Público
- Todas as classes possuem acesso.
---
### Protegido
- Apenas quem é da mesma família pode acessar o atributo. (Quem está no mesmo pacote).
---
### Pacotes (Packages)
- Forma de organizar classes.
- Devem ser usados para melhor organizar os códigos.
---
### Setters
    public void setAutor(String autor){
        this.autor = autor;
    }
- Um método que modifica o valor do atributo;
- this = cria uma referência do atributo dentro da função.
- É no set que eu consigo criar lógica de programação.
---



### Dica:
- Não dá para modificar o valor de um item no array. Quando quiser mudar o item, o retire da lista, e adicione um novo ao final da lista.
- Devo privar tudo para deixar um código mais seguro;
---
