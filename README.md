No Moodle, no mesmo tópico da prova, há um arquivo chamado desempenho.

Dado o arquivo desempenho.txt de uma pesquisa em escola americana de ensino médio sobre o desempenho do exame nacional:

Id  # índice amostrado 

genero # female  ou male

raca      # raça entre White, african american, hispanic, asian

socioeco  # nível sócio econômico: low, Middle, high

oriescol  # origem da escolaridade: public, private

niveispro   # níveis do programa: academic, vocational, general

literatura   # pontuação em literatura

redação     # pontuação em redação      

matematica    # pontuação em matemática       

ciencia        # pontuação em ciência

sociologia    # pontuação em sociologia

 

O data set tem cerca de 200 observações e 11 itens.

Use o R Studio. 

Adapte e Execute o extract da ETL a seguir:

desempenho <- read.delim("C:/Users/Aluno/Downloads/desempenho.txt")

(observação: a parte do endereço em negrito acima, troque pelo correspondente na sua máquina)

Print o View(desempenho)

Responda as 5 questões a seguir, justificando suas respostas com os códigos implementados no ambiente R.

Ao finalizar, copie e cole o código do R Studio no espaço de resposta abaixo, juntamente com as respostas / justificativas das questões. 

Questões: 

1)      Mostre os 6 primeiros registros do dataset e os 6 últimos registros.

2)      Qual a média e 1º quartil do seu conjunto de dados para a coluna matemática.

3)      Determine a quantidade de alunos por genero

4)      Qual o comando para representar um histograma dos dados de literatura, colocando titulo no gráfico, legenda do eixo x e eixo y? Qual análise pode ser feita a partir desse histograma? 

5)      Com base no data set desempenho, obtivemos este resultado (gráfico abaixo). Explique para que serve um gráfico do tipo boxplot e faça uma análise dos resultados do gráfico boxplot abaixo. 
