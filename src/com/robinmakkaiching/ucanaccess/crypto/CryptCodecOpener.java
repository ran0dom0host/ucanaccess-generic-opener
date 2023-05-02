/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robinmakkaiching.ucanaccess.crypto;


import java.io.File;
import java.io.IOException;
 import net.ucanaccess.jdbc.JackcessOpenerInterface;
 //imports from Jackcess Encrypt
 import com.healthmarketscience.jackcess.crypt.CryptCodecProvider;
 import com.healthmarketscience.jackcess.Database;
 import com.healthmarketscience.jackcess.DatabaseBuilder;

 import net.ucanaccess.jdbc.JackcessOpenerInterface;
/**
 *
 * @author RM
 */
public class CryptCodecOpener implements JackcessOpenerInterface {
   public Database open(File fl,String pwd) throws IOException {
    DatabaseBuilder dbd =new DatabaseBuilder(fl);
    dbd.setAutoSync(false);
    dbd.setCodecProvider(new CryptCodecProvider(pwd));
    dbd.setReadOnly(false);
    return dbd.open();
    
   }
   // Notice that the parameter setting AutoSync=false is recommended with UCanAccess for performance reasons. 
   // UCanAccess flushes the updates to disk at transaction end. 
   // For more details about autosync parameter (and related tradeoff), see the Jackcess documentation. 
 }