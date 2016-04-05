/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class MiObjectInputStream extends ObjectInputStream
{
    public MiObjectInputStream(ObjectInputStream out) throws IOException
    {
        super(out);
    }
    protected MiObjectInputStream() throws IOException, SecurityException
    {
        super();
    }
    public MiObjectInputStream(InputStream inputStream) throws IOException {
		super(inputStream);
	}
	protected void readStreamHeader() throws IOException
    {
    }
}