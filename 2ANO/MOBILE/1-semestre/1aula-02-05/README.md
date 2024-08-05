# Apresentação da matéria e explicação de Git e Github

## Comandos básicos de Git
<ul>
    <li>
        <code>git init</code>
         - transforma pasta em repositório criando uma pasta oculta avisando o que agora ela é um repositório
    </li>
    <li>
        <code>git commit -help</code>
         - mostra todas as maneiras de se fazer um commit
    </li>
    <li>
        <code>git commit -am "mensagem do commit"</code>
         - mais usado, commita all files e coloca mensagem
    </li>
    <li>
        <code>git add nomeDoArquivo</code>
         - adiciona arquivos que queremos no nosso próximo commit
    </li>
    <li>
        <code>git status</code>
         - mostra arquivos para serem commitados
    </li>
    <li>
        <code>git add .</code>
         - vai trackear todos os arquivos que nao foram trackeados ainda
    </li>
    <li>
        <code>git checkout -b nomeDaBranch</code>
         - cria e troca para a nova branch
    </li>
    <li>
        <code>git checkout -</code>
         - volta para a última branch
    </li>
    <li>
        <code>git merge nomeDaBranch</code>
         - pega as mudanças da branch e insere na original
    </li>
    <li>
        <code>git push</code>
         - envia o repositorio para o repositorio remoto
    </li>
</ul>