/* Tento soubor obsahuje kod metody test()
napsany v jazyce C.
*/

#include <jni.h>
#include "NativeDemo.h"
#include <stdio.h>

JNIEXPORT void JNICALL Java_NativeDemo_test(JNIEnv *env, jobject obj)
{
   jclass cls;
   jfieldID fid;
   jint i;

   printf("Zacina beh nativni metody.\n");
   cls = (*env)->GetObjectClass(env, obj);
   fid = (*env)->GetFieldID(env, cls, "i", "I");

   if(fid == 0) {
      printf("Nebylo mozne ziska id pole.\n");
      return;
   }

   i = (*env)->GetIntField(env, obj, fid);
   printf("i = %d\n", i);
   (*env)->SetIntField(env, obj, fid, 2*i);
   printf("Konci beh nativni metody.\n");
   fflush(stdout);
	
} 