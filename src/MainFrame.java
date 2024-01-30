import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class MainFrame extends JFrame {
    JFrame frame;
    User user;
    ArrayList<PaintFarmElement> elements;
    ActionListener anL;
    ActionListener crL;

    MainFrame(User user1) {
        this.elements = new ArrayList<>();
        this.user = user1;
        elements = new ArrayList<>();
        MouseListener mb1l = null, mb2l = null, mb3l = null, mb4l = null;
        ImageIcon cowicon = new ImageIcon("Sources/cow.png");
        ImageIcon sheepicon = new ImageIcon("Sources/sheep.png");
        ImageIcon pigicon = new ImageIcon("Sources/pig.png");
        ImageIcon henicon = new ImageIcon("Sources/hen.png");
        ImageIcon cornicon = new ImageIcon("Sources/corn.png");
        ImageIcon wheaticon = new ImageIcon("Sources/wheat.png");
        ImageIcon soybeanicon = new ImageIcon("Sources/soybean.png");
        ImageIcon carroticon = new ImageIcon("Sources/carrot.png");
        this.frame = new JFrame("FarmVille");
        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 134, 430, 150);
        panel1.setLayout(new GridLayout(1, 3));
        panel1.setBackground(Color.orange);
        JPanel menu = new JPanel();
        menu.setBounds(0, 284, 430, 702);
        menu.setLayout(new GridLayout(2, 2));
        menu.setBackground(Color.orange);
        JButton mb1 = new JButton();
        mb1.setBackground(Color.orange);
        mb1.setBorder(null);
        JButton mb2 = new JButton();
        mb2.setBackground(Color.orange);
        mb2.setBorder(null);
        JButton mb3 = new JButton();
        mb3.setBackground(Color.orange);
        mb3.setBorder(null);
        JButton mb4 = new JButton();
        mb4.setBackground(Color.orange);
        mb4.setBorder(null);
        menu.add(mb1);
        menu.add(mb2);
        menu.add(mb3);
        menu.add(mb4);
        Image grassIcon = new ImageIcon("Sources/grassbackground.jpg").getImage();
        JPanelWithBackground field = new JPanelWithBackground(grassIcon);
        field.setBounds(430, 300, 1050, 686);
        Image skyIcon = new ImageIcon("Sources/skybackground.jpg").getImage();
        JPanelWithBackground sky = new JPanelWithBackground(skyIcon);
        sky.setBounds(430, 0, 1050, 300);
        JButton animals = new JButton("Amimals");
        animals.setFont(new Font("Cooper Black", Font.PLAIN, 25));
        animals.setForeground(Color.WHITE);
        animals.setBorder(null);
        animals.setBorderPainted(false);
        animals.setContentAreaFilled(false);
        animals.setOpaque(false);
        JButton crops = new JButton("Crops");
        crops.setFont(new Font("Cooper Black", Font.PLAIN, 25));
        crops.setForeground(Color.WHITE);
        crops.setBorder(null);
        crops.setBorderPainted(false);
        crops.setContentAreaFilled(false);
        crops.setOpaque(false);
        JButton restart = new JButton("Restart");
        restart.setFont(new Font("Cooper Black", Font.PLAIN, 25));
        restart.setForeground(Color.WHITE);
        restart.setBorder(null);
        restart.setBorderPainted(false);
        restart.setContentAreaFilled(false);
        restart.setOpaque(false);
        panel1.add(animals);
        panel1.add(crops);
        panel1.add(restart);
        JLabel ulabel = new JLabel(user1.getUsername() + "'s farm");
        ulabel.setFont(new Font("Cooper Black", Font.PLAIN, 28));
        ulabel.setForeground(Color.WHITE);
        ulabel.setBounds(0, 0, 420, 134);
        ulabel.setHorizontalAlignment(SwingConstants.CENTER);
        Image imgIcon = new ImageIcon("Sources/woodenboard.png").getImage();
        JPanelWithBackground upanel = new JPanelWithBackground(imgIcon);
        upanel.setBounds(0, 0, 430, 134);
        upanel.add(ulabel);
//        ActionListener el = new ActionListener() {
//            ActionListener placingL = new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    field.removeMouseListener(mb1l);
//                    field.removeMouseListener(mb2l);
//                    field.removeMouseListener(mb3l);
//                    field.removeMouseListener(mb4l);
//                    if (e.getSource() == mb1) {
//                        field.addMouseListener(mb1l);
//                    }
//                    if (e.getSource() == mb2) {
//                        field.addMouseListener(mb2l);
//                    }
//                    if (e.getSource() == mb3) {
//                        field.addMouseListener(mb3l);
//                    }
//                    if (e.getSource() == mb4) {
//                        field.addMouseListener(mb4l);
//                    }
//                }
//            };
//            PaintFarmElement currentEl1 = null;
//            MouseListener mb1l = null, mb2l = null, mb3l = null, mb4l = null;
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                mb1l = null; mb2l=null;mb3l=null;mb4l=null;
//                if (e.getSource() == animals) {
//                    mb1.removeActionListener(placingL);
//                    mb2.removeActionListener(placingL);
//                    mb3.removeActionListener(placingL);
//                    mb4.removeActionListener(placingL);
//                    mb1.setIcon(cowicon);
//                    mb2.setIcon(pigicon);
//                    mb3.setIcon(henicon);
//                    mb4.setIcon(sheepicon);
//                    mb1l = new MouseAdapter() {
//                        @Override
//                        public void mouseClicked(MouseEvent e) {
//                            if (e.getModifiers() == MouseEvent.BUTTON1_MASK && e.getClickCount() == 1) {
//                                currentEl1 = new PaintFarmElement(field, e.getX(), e.getY(), "cow");
//                                field.add(currentEl1.drawImage());
//                                //elements.add(currentEl1);
//                                field.repaint();
//                                currentEl1=null;
//                            }
//                        }
//                    };
//                    mb2l = new MouseAdapter() {
//                        @Override
//                        public void mouseClicked(MouseEvent e) {
//                            if (e.getModifiers() == MouseEvent.BUTTON1_MASK && e.getClickCount() == 1) {
//                                currentEl1 = new PaintFarmElement(field, e.getX(), e.getY(), "pig");
//                                field.add(currentEl1.drawImage());
//                                //elements.add(currentEl1);
//                                field.repaint();
//                                currentEl1=null;
//                            }
//                        }
//
//                    };
//                    mb3l = new MouseAdapter() {
//                        @Override
//                        public void mouseClicked(MouseEvent e) {
//                            if (e.getModifiers() == MouseEvent.BUTTON1_MASK && e.getClickCount() == 1) {
//                                currentEl1 = new PaintFarmElement(field, e.getX(), e.getY(), "hen");
//                                field.add(currentEl1.drawImage());
//                                //elements.add(currentEl1);
//                                field.repaint();
//                                currentEl1=null;
//                            }
//                        }
//                    };
//                    mb4l = new MouseAdapter() {
//                        @Override
//                        public void mouseClicked(MouseEvent e) {
//                            if (e.getModifiers() == MouseEvent.BUTTON1_MASK && e.getClickCount() == 1) {
//                                currentEl1 = new PaintFarmElement(field, e.getX(), e.getY(), "sheep");
//                                field.add(currentEl1.drawImage());
//                                //elements.add(currentEl1);
//                                field.repaint();
//                                currentEl1=null;
//                            }
//                        }
//                    };
//
//                    mb1.addActionListener(placingL);
//                    mb2.addActionListener(placingL);
//                    mb3.addActionListener(placingL);
//                    mb4.addActionListener(placingL);
//
//                }
//                if (e.getSource() == crops) {
//                    mb1.removeActionListener(placingL);
//                    mb2.removeActionListener(placingL);
//                    mb3.removeActionListener(placingL);
//                    mb4.removeActionListener(placingL);
//                    mb1.setIcon(wheaticon);
//                    mb2.setIcon(soybeanicon);
//                    mb3.setIcon(carroticon);
//                    mb4.setIcon(cornicon);
//                    mb1l = new MouseAdapter() {
//                        @Override
//                        public void mouseClicked(MouseEvent e) {
//                            final int[] i = {1};
//                            if (e.getModifiers() == MouseEvent.BUTTON3_MASK && e.getClickCount() == 1) {
//                                currentEl1 = new PaintFarmElement(field, e.getX(), e.getY(), "wheatstage" + i[0]);
//                                field.add(currentEl1.drawImage());
//                                //elements.add(currentEl1);
//                                field.repaint();
//                                currentEl1=null;
//                            }
//                        }
//                    };
//                    mb2l = new MouseAdapter() {
//                        @Override
//                        public void mouseClicked(MouseEvent e) {
//                            final int[] i = {1};
//                            if (e.getModifiers() == MouseEvent.BUTTON3_MASK && e.getClickCount() == 1) {
//                                currentEl1 = new PaintFarmElement(field, e.getX(), e.getY(), "soybeanstage" + i[0]);
//                                field.add(currentEl1.drawImage());
//                                //elements.add(currentEl1);
//                                field.repaint();
//                                currentEl1=null;
//                            }
//                        }
//                    };
//
//                    mb3l = new MouseAdapter() {
//                        @Override
//                        public void mouseClicked(MouseEvent e) {
//                            final int[] i = {1};
//                            if (e.getModifiers() == MouseEvent.BUTTON3_MASK && e.getClickCount() == 1) {
//                                currentEl1 = new PaintFarmElement(field, e.getX(), e.getY(), "carrotstage" + i[0]);
//                                field.add(currentEl1.drawImage());
//                                //elements.add(currentEl1);
//                                field.repaint();
//                                currentEl1=null;
//                            }
//
//                        }
//                    };
//                    mb4l = new MouseAdapter() {
//                        @Override
//                        public void mouseClicked(MouseEvent e) {
//                            final int[] i={1};
//                            if (e.getModifiers() == MouseEvent.BUTTON3_MASK && e.getClickCount() == 1) {
//                                currentEl1 = new PaintFarmElement(field, e.getX(), e.getY(), "cornstage"+ i[0]);
//                                field.add(currentEl1.drawImage());
//                                //elements.add(currentEl1);
//                                field.repaint();
//                                currentEl1=null;
//                            }
//                        }
//                    };
//                    mb1.addActionListener(placingL);
//                    mb2.addActionListener(placingL);
//                    mb3.addActionListener(placingL);
//                    mb4.addActionListener(placingL);
//                }
//                if(e.getSource()==restart) {
//                    mb1.removeActionListener(placingL);
//                    mb2.removeActionListener(placingL);
//                    mb3.removeActionListener(placingL);
//                    mb4.removeActionListener(placingL);
//                    field.removeMouseListener(mb1l);
//                    field.removeMouseListener(mb2l);
//                    field.removeMouseListener(mb3l);
//                    field.removeMouseListener(mb4l);
//                    currentEl1=null;
//                    field.removeAll();
//                    field.repaint();
//                }
//            }
//        };
//        animals.addActionListener(el);
//        crops.addActionListener(el);
//        restart.addActionListener(el);
        animals.addActionListener(new ActionListener() {
            PaintFarmElement currentEl1=null;
           MouseListener mb1l = new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getModifiers() == MouseEvent.BUTTON1_MASK && e.getClickCount() == 1) {
                        currentEl1 = new PaintFarmElement(field, e.getX(), e.getY(), "cow");
                        field.add(currentEl1.drawImage());
                        //elements.add(currentEl1);
                        field.repaint();
                    }
                }
            };
            MouseListener mb2l = new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getModifiers() == MouseEvent.BUTTON1_MASK && e.getClickCount() == 1) {
                        currentEl1 = new PaintFarmElement(field, e.getX(), e.getY(), "pig");
                        field.add(currentEl1.drawImage());
                        //elements.add(currentEl1);
                        field.repaint();
                    }
                }

            };
            MouseListener mb3l = new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getModifiers() == MouseEvent.BUTTON1_MASK && e.getClickCount() == 1) {
                        currentEl1 = new PaintFarmElement(field, e.getX(), e.getY(), "hen");
                        field.add(currentEl1.drawImage());
                        //elements.add(currentEl1);
                        field.repaint();
                    }
                }
            };
            MouseListener mb4l = new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getModifiers() == MouseEvent.BUTTON1_MASK && e.getClickCount() == 1) {
                        currentEl1 = new PaintFarmElement(field, e.getX(), e.getY(), "sheep");
                        field.add(currentEl1.drawImage());
                        //elements.add(currentEl1);
                        field.repaint();
                    }
                }
            };

            @Override
            public void actionPerformed(ActionEvent e) {
                mb1.removeActionListener(crL);
                mb2.removeActionListener(crL);
                mb3.removeActionListener(crL);
                mb4.removeActionListener(crL);
                mb1.setIcon(cowicon);
                mb2.setIcon(pigicon);
                mb3.setIcon(henicon);
                mb4.setIcon(sheepicon);
                anL = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        field.removeMouseListener(mb1l);
                        field.removeMouseListener(mb2l);
                        field.removeMouseListener(mb3l);
                        field.removeMouseListener(mb4l);
                        if (e.getSource() == mb1) {
                            field.addMouseListener(mb1l);
                        }
                        if (e.getSource() == mb2) {
                            field.addMouseListener(mb2l);
                        }
                        if (e.getSource() == mb3) {
                            field.addMouseListener(mb3l);
                        }
                        if (e.getSource() == mb4) {
                            field.addMouseListener(mb4l);
                        }
                    }
                };
                mb1.addActionListener(anL);
                mb2.addActionListener(anL);
                mb3.addActionListener(anL);
                mb4.addActionListener(anL);
            }
        });
        crops.addActionListener(new ActionListener() {
            PaintFarmElement currentEl1=null;
             MouseListener mb1l = new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    final int[] i = {1};
                    if (e.getModifiers() == MouseEvent.BUTTON3_MASK && e.getClickCount() == 1) {
                        currentEl1 = new PaintFarmElement(field, e.getX(), e.getY(), "wheatstage" + i[0]);
                        field.add(currentEl1.drawImage());
                        //elements.add(currentEl1);
                        field.repaint();
                    }
                }


            };
            MouseListener mb2l = new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    final int[] i = {1};
                    if (e.getModifiers() == MouseEvent.BUTTON3_MASK && e.getClickCount() == 1) {
                        currentEl1 = new PaintFarmElement(field, e.getX(), e.getY(), "soybeanstage" + i[0]);
                        field.add(currentEl1.drawImage());
                        //elements.add(currentEl1);
                        field.repaint();
                    }
                }
            };

             MouseListener mb3l = new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    final int[] i = {1};
                    if (e.getModifiers() == MouseEvent.BUTTON3_MASK && e.getClickCount() == 1) {
                        currentEl1 = new PaintFarmElement(field, e.getX(), e.getY(), "carrotstage" + i[0]);
                        field.add(currentEl1.drawImage());
                        //elements.add(currentEl1);
                        field.repaint();
                    }

                }
            };
             MouseListener mb4l = new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    final int[] i = {1};
                    if (e.getModifiers() == MouseEvent.BUTTON3_MASK && e.getClickCount() == 1) {
                        currentEl1 = new PaintFarmElement(field, e.getX(), e.getY(), "cornstage" + i[0]);
                        field.add(currentEl1.drawImage());
                        //elements.add(currentEl1);
                        field.repaint();
                    }

                    MouseListener growthml=new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            if (e.getModifiers() == MouseEvent.BUTTON3_MASK && e.getClickCount() == 1) {
                                i[0]++;
                                field.removeMouseListener(mb4l);
                                field.remove(currentEl1.drawImage());
                                currentEl1 = new PaintFarmElement(field, e.getX(), e.getY(), "cornstage" + i[0]);
                            }

                        }
                    };
                   // field.addMouseListener(growthml);


                }

            };

            @Override
            public void actionPerformed(ActionEvent e) {
                mb1.removeActionListener(anL);
                mb2.removeActionListener(anL);
                mb3.removeActionListener(anL);
                mb4.removeActionListener(anL);
                mb4.setIcon(cornicon);
                mb1.setIcon(wheaticon);
                mb2.setIcon(soybeanicon);
                mb3.setIcon(carroticon);
                crL = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        field.removeMouseListener(mb1l);
                        field.removeMouseListener(mb2l);
                        field.removeMouseListener(mb3l);
                        field.removeMouseListener(mb4l);
                        if (e.getSource() == mb1) {
                            field.addMouseListener(mb1l);
                        }
                        if (e.getSource() == mb2) {
                            field.addMouseListener(mb2l);
                        }
                        if (e.getSource() == mb3) {
                            field.addMouseListener(mb3l);
                        }
                        if (e.getSource() == mb4) {
                            field.addMouseListener(mb4l);
                        }
                    }


                };
                mb1.addActionListener(crL);
                mb2.addActionListener(crL);
                mb3.addActionListener(crL);
                mb4.addActionListener(crL);
            }

            });
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.removeAll();;
                field.repaint();
            }
        });
        frame.add(sky);
        frame.add(panel1);
        frame.add(field);
        frame.add(upanel);
        frame.add(menu);
        frame.setSize(1480, 986);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


}




