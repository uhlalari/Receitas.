package com.example.receitas.repository


import com.example.receitas.model.Receita
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class RepositoryImpl : Repository {
    override suspend fun getListaReceita(): RepositoryStatus<List<Receita>> {

        return withContext(Dispatchers.IO) {
            try {
                val listaMok = listOf(
                    Receita("brigadeiro vegano ",
                        "https://firebasestorage.googleapis.com/v0/b/app-de-receita-9c8c6.appspot.com/o/Design%20sem%20nome%20(8).png?alt=media&token=91e981c3-f8cd-467e-ab19-765cbf21bbeb",
                        30,
                        "Leite de aveia: \n" +
                                "1 xícara de aveia\n" +
                                "3 xícaras de água\n" +
                                "bater no liquidificador e coar com um pano\n" +
                                "\n" +
                                "Brigadeiro: \n" +
                                "1 xícara de leite de aveia\n" +
                                "1/2 xícara de açúcar \n" +
                                "Pitadinha de sal \n" +
                                "1 colher de chá de baunilha\n" +
                                "100g de chocolate 70% cacau ( vegano)\n Misturar todos os ingredientes em fogo baixo até o ponto de brigadeiro ",
                        "Vegano"),



                    Receita("pão de queijo fit ",
                        "https://firebasestorage.googleapis.com/v0/b/app-de-receita-9c8c6.appspot.com/o/Design%20sem%20nome%20(9).png?alt=media&token=9180f9a7-80f5-4637-b068-37416163481f",
                        30,
                        "Ingredientes:150g de creme de leite de ricota ( pode usar o light)\n 75g de polvilho azedo\n 100g mussarela light ( pode trocar por parmesao tbm)\n sal a gosto\n\n Modo de preparo\n Junte todos os ingredientes e misture até ficar com a consistencia firme, asse em 180 graus por 15 minutos.",
                        "Vegetariano"),

                    Receita("bolo de limão ",
                        "https://firebasestorage.googleapis.com/v0/b/app-de-receita-9c8c6.appspot.com/o/Design%20sem%20nome%20(11).png?alt=media&token=334d4ecd-0d04-46c3-b273-42e01fe7a8d9",
                        30,
                        "Ingredientes:\n" +
                                "1 e 1/2 xícara de açúcar \n" +
                                "2 colheres de sopa de margarina\n" +
                                "2 limoes suco e casca ralada\n" +
                                "3 xicaras de farinha de trigo\n" +
                                "1/2 xicara de amido de milho\n" +
                                "1/2 xicara de leite \n" +
                                "1 copo de iogurte natural\n" +
                                "1 e 1/4 colher de sopa de fermento em pó \n" +
                                "2 gemas\n" +
                                "2 claras em neve\n" +
                                "\n" +
                                "Modo de preparo: \n" +
                                "Bater as gemas, o açúcar e a margarina.\n" +
                                "\n" +
                                "Misturar a farinha, amido, leite, iogurte e limoes e misturar\n" +
                                "\n" +
                                "Misturar passo 1 e 2 \n" +
                                "Juntar as claras em neve e o fermento na massa e assar por 30 minutos em fogo baixo \n",
                        "Vegetariano"),

                    Receita("gin sabores ",
                        "https://firebasestorage.googleapis.com/v0/b/app-de-receita-9c8c6.appspot.com/o/Design%20sem%20nome%20(15).png?alt=media&token=b62c82f4-a9da-4b32-bd31-147b81abf0a1",
                        5,
                        "1 lata de agua tonica\n" +
                                "1 dose 50ml de gin\n" +
                                "1 dose de de xarope/monin\n" +
                                " de sua preferencia\n" +
                                "Especiarias para gin\n" +
                                "Gelo\n" +
                                "\n" +
                                "\n" +
                                "Acrescente o gelo tonica e gin e posteriormente o xarope e/ou especiarias para gin. \n" ,"Bebida alcoolica"),

                    Receita("gin chocolate ",
                        "https://firebasestorage.googleapis.com/v0/b/app-de-receita-9c8c6.appspot.com/o/Design%20sem%20nome%20(16).png?alt=media&token=c25b6c91-1eed-4de0-9786-9d592b4d87b9",
                        5,
                        "1 lata de agua tonica\n" +
                                "1 dose 50 ml de gin\n" +
                                "Meia dose 25ml de licor de chocolate\n" +
                                "Gelo \n" +
                                "\n" +
                                "Coloque o gelo ate metade da taça, coloque o gin e a tonica, posteriormente acrescente o licor de chocolate.\n"  ,"Bebida alcoolica"),


                    Receita("risoto de abóbora ",
                        "https://firebasestorage.googleapis.com/v0/b/app-de-receita-9c8c6.appspot.com/o/Design%20sem%20nome%20(13).png?alt=media&token=8036d37b-7ec7-438e-a871-89e8c3235720",
                        25,
                        "Ingredientes:\n" +
                                "1xicara de arroz para risoto \n" +
                                "1/2 xicara de vinho branco\n" +
                                "Sal a gosto\n" +
                                "1 xicara de purê de abobora moranga\n" +
                                "1/2 cebola picada em cubos ou ralada\n" +
                                "Meia colher de sopa de azeite \n" +
                                "\n" +
                                "Modo de preparo: Em uma panela em fogo baixo, coloque a cebola para dourar, apos dourar, acrescente os outros ingredientes e va mexendo enquanto cozinha, va acrescentando agua aos poucos para nao secar, apos cozinhar, sirva em seguida.\n" ,
                        "Vegano"),

                    Receita("risoto de queijo ",
                        "https://firebasestorage.googleapis.com/v0/b/app-de-receita-9c8c6.appspot.com/o/Design%20sem%20nome%20(14).png?alt=media&token=af7c5cb0-a735-458b-9a6f-e2c5938ca427",
                        30,
                        "Ingredientes:\n" +
                                "1xicara de arroz para risoto \n" +
                                "1/2 xicara de vinho branco\n" +
                                "Sal a gosto\n" +
                                "100gr de queijo de sua preferencia \n" +
                                "1/2 cebola picada em cubos ou ralada\n" +
                                "Meia colher de sopa de manteiga\n" +
                                "\n" +
                                "Modo de preparo: Em uma panela em fogo baixo, coloque a cebola para dourar, apos dourar, acrescente o vinho, sal e o arroz  e deixe ferver, va acrescentando um pouco de agua caso necessario ate o arroz comecar a ficar macio, apos cozido, acrescente a manteiga, misture ate ficar homogeneo e acrescente o queijo do mesmo modo e sirva em seguida.\n" ,
                        "Vegetariano"),


                    Receita("chips de provolone ",
                        "https://firebasestorage.googleapis.com/v0/b/app-de-receita-9c8c6.appspot.com/o/Design%20sem%20nome%20(12).png?alt=media&token=d2598be1-2b4d-4937-b2b0-dec2edc43563",
                        10,
                        "Ingredientes:\n" +
                                "Provolone\n" +
                                "Papel manteiga\n" +
                                "Modo de preparo:\n" +
                                "Fatiar o provolone bem fininho, forrar a air fryer com o papel manteiga e assar as fatias por aproximadamentr 10 minutos a 200 graus, espere esfriar e retire do papel. \n",
                        "Vegetariano"),


                    Receita("strogonoff ",
                        "https://firebasestorage.googleapis.com/v0/b/app-de-receita-9c8c6.appspot.com/o/Design%20sem%20nome%20(10).png?alt=media&token=964bc4f7-ec3c-4ff7-859e-399332877e1d",
                        30,
                        "Ingredientes:\n" +
                                "200gr de frango desfiado ou picado em cubinhos temperado\n" +
                                "\n" +
                                "1 colher de cafe de colorau\n" +
                                "\n" +
                                "Lemon peper ou pimenta a gosto\n" +
                                "\n" +
                                "Meia caixinha de creme de leite. \n" +
                                "\n" +
                                "50gr de queijo \n" +
                                "\n" +
                                "\n" +
                                "Modo de preparo: com o frango aquecido, misture o creme de leite e o lemon peper e o colorau e deixe dissolver o colorau em fogo baixo, apos dissolver acrescente o queijo, espere derreter e sirva com arroz e batatinhas",
                        "Frango")

                )

                RepositoryStatus.Sucesso(listaMok)
            } catch (t: Throwable) {
                RepositoryStatus.Erro(t)
            }
        }
    }
}
