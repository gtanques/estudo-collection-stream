## Collections

### Queue
    - Ordena em sistema de filas (primeiro a entrar primeiro a sair)
    - Permite adição, leitura e remoção considerando a regra básica
    de uma fila: Primeiro que entra primeiro que sai.
    - Não permite mudança na ordenação.

### Set
- Por padrão não garate ordem.
- Não Permite itens repetidos.
- Permite adição e remoção normalmente.
- Não possui busca por item e atualização para leitura, apenas navegação.
- Não permite mudança de ordenação.
- Não indexada.

    #### Implementações:
        java.util.HashSet = Quando não necessário manter ordenação | Não ordenado, e não permite repetições | Performatica.
        java.util.LinkedHashSet = Quando necessário manter ordenação de inserção | Mantém ordem de inserção | Mais lenta, por manter a ordenação
        java.util.TreeSet = Quando necessário alterar a ordem atravez do uso de comparadores | Mantém a ordem e pode ser reordenada| Performatica apenas para leitura

