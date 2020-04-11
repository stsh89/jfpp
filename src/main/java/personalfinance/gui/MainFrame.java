/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinance.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import personalfinance.exception.ModelException;
import personalfinance.gui.dialog.AboutDialog;
import personalfinance.gui.dialog.AccountAddEditDialog;
import personalfinance.gui.dialog.ArticleAddEditDialog;
import personalfinance.gui.menu.MainMenu;
//import personalfinance.gui.toolbar.FunctionsToolBar;
import personalfinance.gui.toolbar.MainToolbar;
import personalfinance.model.Account;
import personalfinance.model.Article;
import personalfinance.model.Currency;
import personalfinance.settings.Style;
import personalfinance.settings.Text;

/**
 *
 * @author Vitaliy
 */
public class MainFrame extends JFrame implements Refresh{
    
    private final GridBagConstraints constraints;
    private final MainMenu mb;
    private final MainToolbar tb;
    
    public MainFrame() {
        super(Text.get("PROGRAM_NAME"));
        AccountAddEditDialog temp = new AccountAddEditDialog(this);
        try {
            temp.setCommon(new Account("Имя счёта", new Currency("Рубль", "RUB", 1, true, false), 250.53));
        } catch (ModelException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        temp.showDialog();
        
        setResizable(false);
        setIconImage(Style.ICON_MAIN.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mb = new MainMenu(this);
        setJMenuBar(mb);
        
        setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        
        tb = new MainToolbar();
        add(tb, constraints);
        //add(new MainButton("sdsdsf", Style.ICON_MAIN, null, "FDXDFD"));
        //add toolbar
        
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        
        add(new MainDatePicker().getDatePicker(), constraints);
        
        //add(new FunctionsToolBar(), constraints);
        //add leftpanel
        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void refresh() {
        SwingUtilities.updateComponentTreeUI(this);
        mb.refresh();
        pack();
    }
}
