import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;





public class Generator {

    public static void myFrame(){
        StringBuilder password = new StringBuilder();
        Random random = new Random(); 
        JFrame myFrame = new JFrame("Password Generator");
        JLabel generatedPassword = new JLabel("Generated Password");
        JButton generate = new JButton("Generate");
        JTextArea text = new JTextArea();
       
  
        generatedPassword.setFont(new Font("Courier",Font.PLAIN,20));
        generatedPassword.setBounds(550, 20, 250, 100);
        generate.setFont(new Font("Courier",Font.PLAIN,20));
        generate.setBounds(550, 800, 150, 75);
        generate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int lowercaseCharacters = Integer.parseInt(JOptionPane.showInputDialog("Enter how many lowercase characters you want in password"));
                int uppercaseCharacters = Integer.parseInt(JOptionPane.showInputDialog("Enter how many uppercase characters you want in password"));
                int symbols = Integer.parseInt(JOptionPane.showInputDialog("Enter how many symbols you want in password"));
                int numbers = Integer.parseInt(JOptionPane.showInputDialog("Enter how many numbers you want in password"));

                ArrayList<Character> symbol  = new ArrayList<>();
                    for(char val=33;val<48;val++){
                        symbol.add(val);
                    }
                ArrayList<Character> number  = new ArrayList<>();
                    for(char val=48;val<58;val++){
                        number.add(val);
                    }
                ArrayList<Character> lower  = new ArrayList<>();
                    for(char val=97;val<123;val++){
                        lower.add(val);
                    }
                ArrayList<Character> upper  = new ArrayList<>();
                    for(char val=65;val<91;val++){
                        upper.add(val);
                    }
                
                
                for(int i=0;i<lowercaseCharacters;i++){
                    password.append(lower.get(random.nextInt(lower.size())));
                }
                for(int i=0;i<uppercaseCharacters;i++){
                    password.append(upper.get(random.nextInt(upper.size())));
                }
                for(int i=0;i<symbols;i++){
                    password.append(symbol.get(random.nextInt(symbol.size())));
                }
                for(int i=0;i<numbers;i++){
                    password.append(number.get(random.nextInt(number.size())));
                }
                
                
                text.setText(password.toString());
                text.setBounds(250, 150, 700, 600);
               
                
                
                

            }
            
        });
      
     
      
        text.setLineWrap(true);
        myFrame.add(text);
        myFrame.add(generate);
        myFrame.add(generatedPassword);
        myFrame.setResizable(false);
        myFrame.setSize(1200, 1000);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(null);
        myFrame.setVisible(true);
        
    }

    
    
}
