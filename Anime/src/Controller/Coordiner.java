/*
 * The MIT License
 *
 * Copyright 2016 sasukeuni.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package Controller;

import Model.Anime;
import Model.Manipulador;
import View.Anime_add;
import View.Start;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 *
 * @author sasukeuni
 */
public class Coordiner implements ActionListener {

    private Start st_1;
    private Anime_add an_1;
    private Manipulador ma_1 = new Manipulador();

    public Coordiner(Start st_1, Anime_add an_1) {
        this.st_1 = st_1;
        this.an_1 = an_1;
//        actiavte listener
        st_1.Anime_add.addActionListener(this);
        an_1.Guardar.addActionListener(this);
    }

    public void view_Anime_add() {
        an_1.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == an_1.Guardar) {
            Anime an = new Anime();
            an.setTitulo(an_1.txt_Titulo_anime.getText());
            an.setAutor(an_1.txt_Titulo_anime.getText());
            an.setAnno(an_1.txt_anno_anime.getText());
            an.setCapitulos(an_1.txt_Capitulo_anime.getText());
            an.setGenero(an_1.genero.getSelectedItem().toString());
            if (an_1.check_adaptacion.isSelected()) {
                an.setAdaptacion(an_1.txt_apadtado_anime.getText());
            } else {
                an.setAdaptacion("No");
            }
            an.setRating(an_1.txt_punt_anime.getText());
            an.setPublicacion(an_1.combo_Publicacion_anime.getSelectedItem().toString());
            
            try {
                ma_1.write(an);
            } catch (IOException ex) {
            }

        }
        if (e.getSource()==st_1.Anime_add){
            view_Anime_add();
        }
    }

}
