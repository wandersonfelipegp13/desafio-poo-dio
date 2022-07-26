# Desafio: Aprenda na Prática Programação Orientada a Objetos

Implementação do desafio: APRENDENDO NA PRÁTICA O PARADIGMA DE ORIENTAÇÃO A OBJETOS do Bootcamp Spring Framework Experience da [DIGITAL INNOVATION ONE](https://web.digitalinnovation.one/), baseada no [repositório original](https://github.com/cami-la/desafio-poo-dio) do desafio.

## ✨  Novas funcionalidades

Na implementação desse repositório, foi adicionada a validação do Fechamento do bootcamp. Ou seja, se a data em que o Dev estiver tentanto se inscrever no bootcamp for posterior a data de finalização do bootcamp, será exibido uma mensagem de erro dizendo que ele não pode mais se inscrever naquele bootcamp.

Para testar essa validação, você pode definir uma data de fechamento para o bootcamp que esteja no passado, como mostra o código abaixo.

```java
// private final LocalDate dataFinal = dataInicio.plusDays(45);
private final LocalDate dataFinal = LocalDate.of(2022, 6, 25);
```

A validação descrita pode ser vista no código abaixo.

```java
public void increverBootcamp(Bootcamp bootcamp) {
	if (LocalDate.now().isAfter(bootcamp.getDataFinal())) {
		System.err.println("Não é possível se increver pois o bootcamp finalizou!");
		return;
	}
	this.conteudosInscritos.addAll(bootcamp.getConteudos());
	bootcamp.getDevs().add(this);
}
```
