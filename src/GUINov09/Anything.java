package GUINov09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.util.ArrayList;

public class Anything extends JFrame{
    private ArrayList<Student> students;
    private JButton btnOK;
    private JTextField tfName;
    private JPanel jpanel;
    private JRadioButton rbMale;
    private JRadioButton rbFemale;
    private JRadioButton rbOther;
    private JTextArea taOutput;
    private JComboBox cbProgram;
    private JCheckBox cbC;
    private JCheckBox cbJava;
    private JCheckBox cbCpp;
    private JCheckBox cbPython;
    private JCheckBox cbAll;
    private JButton btnLeft;
    private JButton btnRight;
    private JButton btnNew;
    private JTextField tfNumber;
    private JButton btnFileSave;
    private JButton btnLoad;


    JRadioButton[] bgGender = {rbFemale, rbMale, rbOther};
    JCheckBox[] cbProgs = {cbC, cbCpp, cbJava, cbPython};

    private void navigate(int num) {
        if (num > 0 && num <= students.size()) {
            Student s = students.get(num-1);
            tfNumber.setText(num + "");
            tfName.setText(s.name + "");
            bgGender[s.gender].setSelected(true);
            cbProgram.setSelectedItem(s.program.name());
            for (int i = 0; i < cbProgs.length; i++) {
                cbProgs[i].setSelected(s.progs[i]);
            }
        }
    }

    public Anything() {
        students = new ArrayList<>();
        JButton btnRandom = new JButton("HIII");
        add(btnRandom);
        btnRandom.setSize(50,50);
//        jpanel.add(btnRandom);
        rbOther.setSelected(true);
        for (Component comp : jpanel.getComponents()) {
            comp.setFont(new Font(null, Font.BOLD, 32));
//            comp.setForeground(Color.ORANGE);
        }

        btnLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    BufferedReader br = new BufferedReader(new FileReader("studentfile.txt"));
                    String stud;
                    while ((stud = br.readLine()) != null) {
                        students.add(new Student(stud));
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
        });

        btnFileSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BufferedWriter bw = null;
                try {
                    bw = new BufferedWriter(new FileWriter("studentfile.txt"));
                    for (Student s : students) {
                        bw.write(s.toString());
                        bw.newLine();
                    }

                } catch (IOException e2) {
                    e2.printStackTrace();
                } finally {
                    try {
                        bw.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        btnNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfNumber.setText("");
                tfName.setText("");
                rbOther.setSelected(true);
                for (JCheckBox cb : cbProgs) {
                    cb.setSelected(false);
                }
                cbProgram.setSelectedIndex(0);
            }
        });

        cbProgram.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                cbProgram.setForeground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        for (JCheckBox cb : cbProgs) {
            cb.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int cnt_progs = 0;
                    for (JCheckBox cb : cbProgs) {
                        if (cb.isSelected()) {
                            cnt_progs++;
                        }
                    }
                    cbAll.setSelected(cnt_progs == cbProgs.length);
                }
            });
        }

        cbAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbAll.isSelected()) {
                    for (JCheckBox cb : cbProgs) {
                        cb.setSelected(true);
                    }
                } else {
                    for (JCheckBox cb : cbProgs) {
                        cb.setSelected(false);
                    }
                }
            }
        });

        btnLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(tfNumber.getText());
                    navigate(num-1);
                }catch (NumberFormatException e1) {
                    navigate(0);
                }
            }
        });
        btnRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(tfNumber.getText());
                    navigate(num+1);
                }catch (NumberFormatException e1) {
                    navigate(students.size()-1);
                }
            }
        });



        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student s;
                if (tfNumber.getText().equals("")) {
                    s = new Student();
                    students.add(s);
                    tfNumber.setText(students.size() + "");
                } else {
                    s = students.get(Integer.parseInt(tfNumber.getText())-1);
                }
                if (cbProgram.getSelectedIndex() == 0) {
                    int res = JOptionPane.showConfirmDialog(null,
                            "No program. Use BSCS?");
                    if (res == JOptionPane.YES_OPTION) {
                        cbProgram.setSelectedIndex(1);
                    } else {
                        cbProgram.setForeground(Color.RED);
                        return;
                    }
                }
                String name = tfName.getText();
                if (name.equals("")) {
                    name = JOptionPane.showInputDialog(null, "Please enter name");
                    tfName.setText(name);
//                    return;
                }
                taOutput.setText("Hello, " + name);
                s.name = name;
                int ctr = 0;
                for (JRadioButton bgGen : bgGender) {
                    if (bgGen.isSelected()) {
                        taOutput.append("\nYour gender is " + bgGen.getText());
                        s.gender = ctr;
                    }
                    ctr++;
                }
                taOutput.append("\nYour program is " + cbProgram.getSelectedItem());
                s.program = Program.values()[cbProgram.getSelectedIndex()-1];
                int cnt_progs = 0;
                for (JCheckBox cb : cbProgs) {
                    if (cb.isSelected()) {
                        cnt_progs++;
                    }
                }
                if (cnt_progs == 0) {
                    taOutput.append("\nNo languages learned yet.");
                } else {
                    int i = 0;
                    ctr = 0;
                    taOutput.append("\nYour languages: ");
                    for (JCheckBox cb : cbProgs) {
                        if (cb.isSelected()) {
                            taOutput.append(cb.getText());
                            if (++i < cnt_progs) {
                                taOutput.append(", ");
                            }
                        }
                        s.progs[ctr++] = cb.isSelected();
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        Anything app = new Anything();
        app.setContentPane(app.jpanel);
        JButton btn = new JButton("HIEFS");
        app.setSize(1000, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Hello World");
        app.setVisible(true);
    }
}
