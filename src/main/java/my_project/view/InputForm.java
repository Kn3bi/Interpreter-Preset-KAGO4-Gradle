package my_project.view;

import my_project.control.ProgramController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputForm {

    private JPanel contentPanel;
    private JButton runButton;
    private JButton closeButton;
    private JScrollPane scrollPane;
    private JTextArea inputArea;
    private ProgramController programController;

    public InputForm(ProgramController pc){
        programController = pc;
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public JPanel getContentPanel(){
        return contentPanel;
    }
}
