package tundra.list;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2012-06-23 15:58:03 EST
// -----( ON-HOST: 172.16.70.129

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class string

{
	// ---( internal utility methods )---

	final static string _instance = new string();

	static string _newInstance() { return new string(); }

	static string _cast(Object o) { return (string)o; }

	// ---( server methods )---




	public static final void append (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(append)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:optional $list
		// [i] field:0:optional $item
		// [o] field:1:required $list
		tundra.list.object.append(pipeline, String.class);
		// --- <<IS-END>> ---

                
	}



	public static final void compact (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(compact)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:optional $list
		// [o] field:1:optional $list
		tundra.list.object.compact(pipeline);
		// --- <<IS-END>> ---

                
	}



	public static final void concatenate (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(concatenate)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:optional $list.x
		// [i] field:1:optional $list.y
		// [o] field:1:optional $list
		tundra.list.object.concatenate(pipeline);
		// --- <<IS-END>> ---

                
	}



	public static final void each (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(each)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:optional $list
		// [i] field:0:optional $service
		// [i] record:0:optional $pipeline
		// [i] field:0:optional $item.input
		tundra.list.object.each(pipeline);
		// --- <<IS-END>> ---

                
	}



	public static final void equal (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(equal)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:optional $list.x
		// [i] field:1:optional $list.y
		// [o] field:0:required $equal?
		tundra.list.object.equal(pipeline);
		// --- <<IS-END>> ---

                
	}



	public static final void include (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(include)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:optional $list
		// [i] field:0:optional $item
		// [o] field:0:required $include?
		tundra.list.object.include(pipeline);
		// --- <<IS-END>> ---

                
	}



	public static final void insert (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(insert)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:optional $list
		// [i] field:0:optional $item
		// [i] field:0:required $index
		// [o] field:1:required $list
		tundra.list.object.insert(pipeline, String.class);
		// --- <<IS-END>> ---

                
	}



	public static final void item (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(item)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:optional $list
		// [i] field:0:required $index
		// [o] field:0:optional $item
		tundra.list.object.item(pipeline);
		// --- <<IS-END>> ---

                
	}



	public static final void join (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(join)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:optional $list
		// [i] field:0:optional $separator
		// [o] field:0:required $result
		tundra.list.object.join(pipeline);
		// --- <<IS-END>> ---

                
	}



	public static final void length (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(length)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:optional $list
		// [o] field:0:required $length
		tundra.list.object.length(pipeline);
		// --- <<IS-END>> ---

                
	}



	public static final void map (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(map)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:optional $list
		// [i] field:0:optional $service
		// [i] field:0:optional $item.input
		// [i] field:0:optional $item.output
		// [o] field:1:optional $list
		tundra.list.object.map(pipeline);
		// --- <<IS-END>> ---

                
	}



	public static final void prepend (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(prepend)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:optional $list
		// [i] field:0:optional $item
		// [o] field:1:required $list
		tundra.list.object.prepend(pipeline, String.class);
		// --- <<IS-END>> ---

                
	}



	public static final void reverse (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(reverse)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:optional $list
		// [o] field:1:optional $list
		tundra.list.object.reverse(pipeline);
		// --- <<IS-END>> ---

                
	}



	public static final void slice (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(slice)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:optional $list
		// [i] field:0:optional $index
		// [i] field:0:optional $length
		// [o] field:1:optional $list
		tundra.list.object.slice(pipeline);
		// --- <<IS-END>> ---

                
	}



	public static final void sort (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(sort)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:optional $list
		// [o] field:1:optional $list
		tundra.list.object.sort(pipeline);
		// --- <<IS-END>> ---

                
	}



	public static final void unique (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(unique)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:1:optional $list
		// [o] field:1:optional $list
		tundra.list.object.unique(pipeline);
		// --- <<IS-END>> ---

                
	}

	// --- <<IS-START-SHARED>> ---
	// returns a new array with all elements sorted
	public static IData[] sort(IData[] array, String key) {
	  return IDataUtil.sortIDataArrayByKey(array, key, IDataUtil.COMPARE_TYPE_COLLATION, false);
	}
	// --- <<IS-END-SHARED>> ---
}
