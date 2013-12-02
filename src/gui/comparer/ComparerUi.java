/*
 * Copyright (C) 2013 DobinRutishauser@broken.ch
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package gui.comparer;

import model.SentinelHttpMessage;

/**
 *
 * @author DobinRutishauser@broken.ch
 */
public class ComparerUi extends javax.swing.JPanel {

    /**
     * Creates new form ComparerUi
     */
    public ComparerUi() {
        initComponents();
    }
    
    public void setMessages(SentinelHttpMessage msg1, SentinelHttpMessage msg2) {
        panelViewMessageUi1.setHttpMessage(msg1);
        panelViewMessageUi2.setHttpMessage(msg2);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelViewMessageUi1 = new gui.viewMessage.PanelViewMessageUi();
        panelViewMessageUi2 = new gui.viewMessage.PanelViewMessageUi();

        setLayout(new java.awt.GridLayout(1, 2));
        add(panelViewMessageUi1);
        add(panelViewMessageUi2);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.viewMessage.PanelViewMessageUi panelViewMessageUi1;
    private gui.viewMessage.PanelViewMessageUi panelViewMessageUi2;
    // End of variables declaration//GEN-END:variables
}
