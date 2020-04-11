/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinance.gui.toolbar;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import personalfinance.gui.MainButton;
import personalfinance.gui.Refresh;

/**
 *
 * @author Vitaliy
 */
abstract public class AbstractToolbar extends JPanel implements Refresh { 
    
    public AbstractToolbar(EmptyBorder border) {
        super();
        setBorder(border);
    }
    
    abstract protected void init();
    
    protected MainButton addButton(String title, ImageIcon icon, String action, boolean topIcon) {
        MainButton button = new MainButton(title, icon, null, action);
        if (topIcon) {
            button.setHorizontalTextPosition(SwingConstants.CENTER);
            button.setVerticalTextPosition(SwingConstants.BOTTOM);
        } else {
            button.setHorizontalTextPosition(SwingConstants.RIGHT);
            button.setVerticalTextPosition(SwingConstants.CENTER);
        }
        add(button);
        return button;
    }
    
    @Override
    public void refresh() {
        removeAll();
        init();
    }
}
