package com.nedev.eboko.tools;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.util.Log;

import java.io.IOException;
import java.net.InetAddress;


public final class ConnexionDetector {
	private Context _context;

	public ConnexionDetector(Context context){
		this._context = context;
	}

	public boolean isConnectingToInternet(){
		ConnectivityManager connectivity = (ConnectivityManager) _context.getSystemService(Context.CONNECTIVITY_SERVICE);
		if (connectivity != null) 
		{
			NetworkInfo[] info = connectivity.getAllNetworkInfo
					();
			if (info != null) 
				for (int i = 0; i < info.length; i++) 
					if (info[i].getState() == State.CONNECTED){
						return true;
					}

		}
		return false;
	}

	public static boolean hostAvailabilityCheck1(String server_adress, int port) throws IOException {
		boolean b = false;
		try{
			InetAddress address = InetAddress.getByName(server_adress);
			b = address.isReachable(10*1000);
		}catch(Exception ex){
			Log.e("Connexion detector","error"+ex.getMessage());
		}

		return b;
	}


	public static boolean isConnected(Context ctx){

		ConnectivityManager connectivityManager = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();

		if(activeNetworkInfo != null){

			State networkState = activeNetworkInfo.getState();

			if(networkState.compareTo(State.CONNECTED) == 0){

				return true;
			}
		}
		return false;
	}
}
