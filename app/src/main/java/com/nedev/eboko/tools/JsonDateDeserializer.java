/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nedev.eboko.tools;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class JsonDateDeserializer implements JsonDeserializer<Date> {
    
    @Override
    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
      String s = json.getAsJsonPrimitive().getAsString();
      DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.FRENCH);
      Date d = null;
      try{
	      long l = Long.parseLong(s.substring(0, s.length()));//6, s.length() - 2
	       d = df.parse(df.format(new Date(l)));
	       return d;
      }catch(Exception e){
    	 // DateFormat df_ = new SimpleDateFormat("ddd MMM ");
    	  return new Date();
      } 
   }
}