package tundra;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2012-05-12 17:02:53 EST
// -----( ON-HOST: 172.16.70.129

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class bytes

{
	// ---( internal utility methods )---

	final static bytes _instance = new bytes();

	static bytes _newInstance() { return new bytes(); }

	static bytes _cast(Object o) { return (bytes)o; }

	// ---( server methods )---




	public static final void normalize (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(normalize)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $object
		// [i] field:0:optional $encoding
		// [o] object:0:optional $bytes
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		  Object object = IDataUtil.get(cursor, "$object");
		  String encoding = IDataUtil.getString(cursor, "$encoding");
		
		  IDataUtil.put(cursor, "$bytes", normalize(object, encoding));
		} catch(java.io.IOException ex) {
		  tundra.exception.raise(ex);
		} finally {
		  cursor.destroy();
		}
		// --- <<IS-END>> ---

                
	}

	// --- <<IS-START-SHARED>> ---
	public static byte[] normalize(Object object, String encoding) throws java.io.IOException {
	  if (encoding == null) encoding = tundra.support.constant.DEFAULT_CHARACTER_ENCODING;
	  
	  byte[] bytes = null;
	  
	  if (object != null) {
	    if (object instanceof byte[]) {
	      bytes = (byte[])object;
	    } else if (object instanceof String) {
	      bytes = ((String)object).getBytes(encoding);
	    } else if (object instanceof java.io.InputStream) {
	      java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
	      tundra.stream.copy((java.io.InputStream)object, out);
	      bytes = out.toByteArray();
	    } else {
	      throw new IllegalArgumentException("object must be a string, byte[] or java.io.InputStream: " + object.getClass().getName());
	    }
	  }
	
	  return bytes;
	}
	// --- <<IS-END-SHARED>> ---
}

