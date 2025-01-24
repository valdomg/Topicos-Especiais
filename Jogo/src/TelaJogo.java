import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class TelaJogo extends JFrame{

    private TelaObjeto bolinha;
    private Timer timer;
    private Mouse mouse;
    private TelaSprite sprites;

    public TelaJogo(String nome){
        super.setTitle(nome);
        setAlwaysOnTop(true);
        setAutoRequestFocus(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        

        this.sprites = new TelaSprite();
        this.bolinha = new TelaObjeto();
        this.mouse = new Mouse(bolinha, this);
        this.timer = new Timer(10, new Animacao(bolinha, mouse));

        getContentPane().add(bolinha);
        
        addMouseListener(mouse);
        
        
        timer.start();
        pack();
    }

}