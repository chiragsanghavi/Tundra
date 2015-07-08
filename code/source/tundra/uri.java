package tundra;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2015-07-09 08:46:25 AEST
// -----( ON-HOST: 192.168.66.129

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.net.URISyntaxException;
import permafrost.tundra.flow.VariableSubstitutor;
import permafrost.tundra.lang.ExceptionHelper;
import permafrost.tundra.net.uri.URIHelper;
// --- <<IS-END-IMPORTS>> ---

public final class uri

{
	// ---( internal utility methods )---

	final static uri _instance = new uri();

	static uri _newInstance() { return new uri(); }

	static uri _cast(Object o) { return (uri)o; }

	// ---( server methods )---




	public static final void decode (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(decode)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:optional $string
		// [i] field:0:optional $encoding
		// [o] field:0:optional $string
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		    String string = IDataUtil.getString(cursor, "$string");
		    String encoding = IDataUtil.getString(cursor, "$encoding");
		
		    if (string != null) IDataUtil.put(cursor, "$string", URIHelper.decode(string, encoding));
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---

                
	}



	public static final void emit (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(emit)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] record:0:optional $uri
		// [i] - field:0:optional scheme
		// [i] - field:0:optional body
		// [i] - record:0:optional authority
		// [i] -- field:0:optional registry
		// [i] -- record:0:optional server
		// [i] --- field:0:optional user
		// [i] --- field:0:optional password
		// [i] --- field:0:required host
		// [i] --- field:0:optional port
		// [i] - field:1:optional path
		// [i] - field:0:optional file
		// [i] - record:0:optional query
		// [i] - field:0:optional fragment
		// [o] field:0:optional $string
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		    IData uri = IDataUtil.getIData(cursor, "$uri");
		    if (uri != null) IDataUtil.put(cursor, "$string", URIHelper.emit(uri));
		} catch(URISyntaxException ex) {
			ExceptionHelper.raise(ex);
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---

                
	}



	public static final void encode (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(encode)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:optional $string
		// [i] field:0:optional $encoding
		// [o] field:0:optional $string
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		    String string = IDataUtil.getString(cursor, "$string");
		    String encoding = IDataUtil.getString(cursor, "$encoding");
		
		    if (string != null) IDataUtil.put(cursor, "$string", URIHelper.encode(string, encoding));
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---

                
	}



	public static final void normalize (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(normalize)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:optional $string
		// [o] field:0:optional $string
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		    String string = IDataUtil.getString(cursor, "$string");
		    if (string != null) IDataUtil.put(cursor, "$string", URIHelper.normalize(string));
		} catch(URISyntaxException ex) {
		    ExceptionHelper.raise(ex);
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---

                
	}



	public static final void parse (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(parse)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:optional $string
		// [o] record:0:optional $uri
		// [o] - field:0:optional scheme
		// [o] - field:0:optional body
		// [o] - record:0:optional authority
		// [o] -- field:0:optional registry
		// [o] -- record:0:optional server
		// [o] --- field:0:optional user
		// [o] --- field:0:optional password
		// [o] --- field:0:required host
		// [o] --- field:0:optional port
		// [o] - field:1:optional path
		// [o] - field:0:optional file
		// [o] - record:0:optional query
		// [o] - field:0:optional fragment
		// [o] - field:0:required absolute?
		// [o] - field:0:required opaque?
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		    String string = IDataUtil.getString(cursor, "$string");
		    if (string != null) IDataUtil.put(cursor, "$uri", URIHelper.parse(string));
		} catch(URISyntaxException ex) {
		    ExceptionHelper.raise(ex);
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---

                
	}
}

