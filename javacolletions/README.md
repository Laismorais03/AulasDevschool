## Java Collections 
 Nas primeiras versões de java já eram disponiveis estruturas de arrays e as classes ``Vector`` e ``Hashtable``. No entanto, além da dificuldade em implementar estruturas de dados utilizando arrays,  também sentiam-se falta de classes que implementassem estruturas como listas ligadas e tabelas de espalhamento (hash). Para atender a essas necessidades, só apartir do Java 1.2 que foi criado um conjunto de interfaces e classes dada como Collections Framework que e utilizado atraves do pacote **java.util.list** .

## List
*A interface List é uma coleção do tipo lista, em que os elementos em uma lista são ordenados como uma sequência. O usuário pode utilizar o número do índice para acessar um determinado elemento da lista*                                                                                                             
 Na hierarquia do Java Collections o ``List`` é uma interface implementada na classes _ArrayList_, _LinkedList_ e na _Vector_ que também é extendida da classe _Stack_ .
 
![ScreenShot](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20200811210521/Collection-Framework-1.png)

### Tipos de List
- ArrayList


A ArrayList é uma classe que implementa a interface ``List`` , esta classe tem seus objetos arrays dinâmicos. O ArrayList implementa todos os métodos List e permite todos elementos até mesmo os nulos. Os objetos desta classe têm uma capacidade, que inicialmente igual ao tamanho, mas aumenta à medida que novos elementos são adicionados, ela não está sincronizado então varias unidades de controle de fluxo sequencial pode ser processada no sistema operacional.































