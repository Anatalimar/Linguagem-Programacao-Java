
package primeirajanela;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Anatalimar Mauricio de Lemos
 */
public class PrimeiraJanela {

    public static void main(String[] args) {
        
        JLabel msg = new JLabel("Bem-vindo a primeira janela.", JLabel.CENTER);
        msg.setFont(new Font("Calibri", Font.BOLD, 25));
        
        JButton botao = new JButton();
        botao.setSize(10, 20);
        botao.setText("Fechar Janela");
        
        
        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 400);
        janela.setVisible(true);
        janela.setTitle("Minha Primeira Jenela em Java");
        janela.add(msg);
        //janela.add(botao);
    }
    
}
