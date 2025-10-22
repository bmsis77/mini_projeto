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

> print(desempenho)
    id genero             raca socioeco oriescol  niveispro literatura redacao matematica
1   70   male            white      low   public    general         57      52         41
2  121 female            white   middle   public vocational         68      59         53
3   86   male            white     high   public    general         44      33         54
4  141   male            white     high   public vocational         63      44         47
5  172   male            white   middle   public   academic         47      52         57
6  113   male            white   middle   public   academic         44      52         51
7   50   male african american   middle   public    general         50      59         42
8   11   male         hispanic   middle   public   academic         34      46         45
9   84   male            white   middle   public    general         63      57         54
10  48   male african american   middle   public   academic         57      55         52
11  75   male            white   middle   public vocational         60      46         51
12  60   male            white   middle   public   academic         57      65         51
13  95   male            white     high   public   academic         73      60         71
14 104   male            white     high   public   academic         54      63         57
15  38   male african american      low   public   academic         45      57         50
16 115   male            white      low   public    general         42      49         43
17  76   male            white     high   public   academic         47      52         51
18 195   male            white   middle  private    general         57      57         60
19 114   male            white     high   public   academic         68      65         62
20  85   male            white   middle   public    general         55      39         57
21 167   male            white   middle   public    general         63      49         35
22 143   male            white   middle   public vocational         63      63         75
23  41   male african american   middle   public   academic         50      40         45
24  20   male         hispanic     high   public   academic         60      52         57
25  12   male         hispanic   middle   public vocational         37      44         45
26  53   male african american   middle   public vocational         34      37         46
27 154   male            white     high   public   academic         65      65         66
28 178   male            white   middle  private vocational         47      57         57
29 196   male            white     high  private   academic         44      38         49
30  29   male            asian      low   public    general         52      44         49
31 126   male            white   middle   public    general         42      31         57
32 103   male            white     high   public   academic         76      52         64
33 192   male            white     high  private   academic         65      67         63
34 150   male            white   middle   public vocational         42      41         57
35 199   male            white     high  private   academic         52      59         50
36 144   male            white     high   public    general         60      65         58
37 200   male            white   middle  private   academic         68      54         75
38  80   male            white     high   public   academic         65      62         68
39  16   male         hispanic      low   public vocational         47      31         44
40 153   male            white   middle   public vocational         39      31         40
41 176   male            white   middle  private   academic         47      47         41
42 177   male            white   middle  private   academic         55      59         62
43 168   male            white   middle   public   academic         52      54         57
44  40   male african american      low   public    general         42      41         43
45  62   male            white     high   public    general         65      65         48
46 169   male            white      low   public    general         55      59         63
47  49   male african american     high   public vocational         50      40         39
48 136   male            white   middle   public   academic         65      59         70
49 189   male            white   middle  private   academic         47      59         63
50   7   male         hispanic   middle   public   academic         57      54         59
51  27   male            asian   middle   public   academic         53      61         61
52 128   male            white     high   public   academic         39      33         38
53  21   male         hispanic   middle   public    general         44      44         61
54 183   male            white   middle  private   academic         63      59         49
55 132   male            white   middle   public   academic         73      62         73
56  15   male         hispanic     high   public vocational         39      39         44
57  67   male            white      low   public vocational         37      37         42
58  22   male         hispanic   middle   public vocational         42      39         39
59 185   male            white   middle  private   academic         63      57         55
60   9   male         hispanic   middle   public vocational         48      49         52
61 181   male            white   middle  private   academic         50      46         45
62 170   male            white     high   public   academic         47      62         61
63 134   male            white      low   public    general         44      44         39
64 108   male            white   middle   public    general         34      33         41
65 197   male            white     high  private   academic         50      42         50
66 140   male            white   middle   public vocational         44      41         40
67 171   male            white   middle   public   academic         60      54         60
68 107   male            white      low   public vocational         47      39         47
69  81   male            white      low   public   academic         63      43         59
70  18   male         hispanic   middle   public vocational         50      33         49
71 155   male            white   middle   public    general         44      44         46
72  97   male            white     high   public   academic         60      54         58
73  68   male            white   middle   public   academic         73      67         71
74 157   male            white   middle   public    general         68      59         58
75  56   male            white   middle   public vocational         55      45         46
76   5   male         hispanic      low   public   academic         47      40         43
77 159   male            white     high   public   academic         55      61         54
78 123   male            white     high   public    general         68      59         56
79 164   male            white   middle   public vocational         31      36         46
80  14   male         hispanic     high   public   academic         47      41         54
81 127   male            white     high   public   academic         63      59         57
82 165   male            white      low   public vocational         36      49         54
83 174   male            white   middle  private   academic         68      59         71
84   3   male         hispanic      low   public   academic         63      65         48
85  58   male            white   middle   public vocational         55      41         40
86 146   male            white     high   public   academic         55      62         64
87 102   male            white     high   public   academic         52      41         51
88 117   male            white     high   public vocational         34      49         39
89 133   male            white   middle   public vocational         50      31         40
90  94   male            white     high   public   academic         55      49         61
   ciencia sociologia
1       47         57
2       63         61
3       58         31
4       53         56
5       53         61
6       63         61
7       53         61
8       39         36
9       58         51
10      50         51
11      53         61
12      63         61
13      61         71
14      55         46
15      31         56
16      50         56
17      50         56
18      58         56
19      55         61
20      53         46
21      66         41
22      72         66
23      55         56
24      61         61
25      39         46
26      39         31
27      61         66
28      58         46
29      39         46
30      55         41
31      47         51
32      64         61
33      66         71
34      72         31
35      61         61
36      61         66
37      66         66
38      66         66
39      36         36
40      39         51
41      42         51
42      58         51
43      55         51
44      50         41
45      63         66
46      69         46
47      49         47
48      63         51
49      53         46
50      47         51
51      57         56
52      47         41
53      50         46
54      55         71
55      69         66
56      26         42
57      33         32
58      56         46
59      58         41
60      44         51
61      58         61
62      69         66
63      34         46
64      36         36
65      36         61
66      50         26
67      55         66
68      42         26
69      65         44
70      44         36
71      39         51
72      58         61
73      63         66
74      74         66
75      58         51
76      45         31
77      49         61
78      63         66
79      39         46
80      42         56
81      55         56
82      61         36
83      66         56
84      63         56
85      44         41
86      63         66
87      53         56
88      42         56
89      34         31
90      61         56
 [ reached 'max' / getOption("max.print") -- omitted 110 rows ]
