package com.OsMoDroid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.security.MessageDigest;

import org.apache.http.util.ByteArrayBuffer;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Application;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.support.v4.app.NotificationCompat.Builder;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.OsMoDroid.R;
public class Netutil {
	
					dialog= ProgressDialog.show(mContext,"", mContext.getString(R.string.commandpleasewait), true);
	    
	    if(con!=null){
	    	con.disconnect();
	    	
	    	}

			con.connect();
			try {
					String str=inputStreamToString(in);
			} catch (Exception e) {
	        return resAPI;
	    @Override

	    @Override
	}
	public static MyAsyncTask newapicommand(ResultsListener listener, String action) {
		MyAsyncTask t = new MyAsyncTask((ResultsListener) context, context);
	}
		MyAsyncTask t = new MyAsyncTask((ResultsListener) context, context);
	}
			MyAsyncTask t = new MyAsyncTask(listener);
	

	public static String inputStreamToString(InputStream in) throws IOException, NullPointerException {

	public static String bytesToHex(byte[] b) {

	public static String SHA1(String text) {
	}
		
		
				Log.d(this.getClass().getName(), "InitTask onpostexecute call map by app");
				OsMoDroid.activity.drawClickListener.map.onDeviceChange(null);
			}
			else {
				Log.d(this.getClass().getName(), "InitTask onpostexecute null map");
			}
	{
	    while (true)
	    {
	        int n=s.indexOf("&#");
	        if (n<0) break;
	        int m=s.indexOf(";",n+2);
	        if (m<0) break;
	        try
	        {
	            s=s.substring(0,n)+(char)(Integer.parseInt(s.substring(n+2,m)))+
	                s.substring(m+1);
	        }
	        catch (Exception e)
	        {
	            return s;
	        }
	    }
	    s=s.replace("&quot;","\"");
	    s=s.replace("&lt;","<");
	    s=s.replace("&gt;",">");
	    s=s.replace("&amp;","&");
	    return s;
	}


	
	
	
}