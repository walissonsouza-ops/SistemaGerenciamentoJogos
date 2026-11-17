package SistemaJogosPackage;

import java.util.List;

public interface SistemaGerenciamentoJogos {
    public void cadatrarJogo (String nome) throws JogoNaoExisteException;
    public void removerJogo (String nome) throws JogoNaoExisteException;
    public double horasJogadas (String nome) throws JogoNaoExisteException;
    public List < jogos > listarJogos;
    public Jogo pesquisarJogo(String nome) throws JogoNaoExisteException;
    public boolean jogoExiste (String nome);


}
