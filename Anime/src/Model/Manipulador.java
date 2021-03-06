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
package Model;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author sasukeuni
 */
public class Manipulador {

    public static void write(Anime a) throws IOException {
        File arch = new File("Anime.txt");
        if (arch.exists()) {

        }
    }

    public class MiObjectOutputStream extends ObjectOutputStream {

        /**
         * Constructor que recibe OutputStream
         */
        public MiObjectOutputStream(OutputStream out) throws IOException {
            super(out);
        }

        /**
         * Constructor sin parámetros
         */
        protected MiObjectOutputStream() throws IOException, SecurityException {
            super();
        }

        /**
         * /**
         * Redefinición del método de escribir la cabecera para que no haga
         * nada.
         *
         * protected void writeStreamHeader() throws IOException { }
         */
        protected void writeStreamHeader() throws IOException {
            // do not write a header, but reset the handle list
        }

    }
}
