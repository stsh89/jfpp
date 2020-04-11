/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinance.gui.toolbar;

import personalfinance.gui.EnableEditDelete;
import personalfinance.gui.MainButton;
import personalfinance.settings.HandlerCode;
import personalfinance.settings.Style;
import personalfinance.settings.Text;

/**
 *
 * @author Vitaliy
 */
public final class FunctionsToolBar extends AbstractToolbar implements EnableEditDelete{
    private MainButton editButton;
    private MainButton deleteButton;
    
    public FunctionsToolBar() {
        super(Style.BORDER_FUNCTIONS_TOOLBAR);
        init();
    }

    @Override
    protected void init() {
        addButton(Text.get("ADD"), Style.ICON_ADD, HandlerCode.ADD, false);
        editButton = addButton(Text.get("EDIT"), Style.ICON_EDIT, HandlerCode.EDIT, false);
        editButton = addButton(Text.get("DELETE"), Style.ICON_DELETE, HandlerCode.DELETE, false);
    }

    @Override
    public void setEnableEditDelete(boolean enable) {
        editButton.setEnabled(enable);
        deleteButton.setEnabled(enable);
    }
    
    
   
}
