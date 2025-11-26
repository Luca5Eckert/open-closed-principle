1. Identificação da Falha OCP
 Descreva, com suas palavras, por que a forma atual de lidar com a criação de novos descontos na CalculadoraDeDesconto é considerada um mau design de acordo com o OCP.

  R: É considerado um pessímo design porque desconsidera a necessidade de extensão futura. O código fica "preso", dificultando a manutenção e alteração dele. Além disso o código fica com multiplas responsabilidades, tendo muitos motivos para serem alterados, quebrando o SRP.

 
