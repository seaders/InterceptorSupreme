package com.seaders.sblanch;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ActivityAspect {
    @Around("execution(* com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(..) )")
    public Object aspectIDFA(ProceedingJoinPoint joinPoint) throws Throwable {
        Log.i("helloAOP", "aspect:::" + joinPoint.getSignature());
        return null;
    }
}