package com.guarda.zcash.sapling.rxcall

import org.junit.Test
import java.nio.charset.Charset

class CallGetMemoTest {

    @Test
    fun testStringDecoding() {

//        D/SaplingNotePlaintext: SaplingNotePlaintext decrypt snp= SaplingNotePlaintext{
//            d=[-13, -122, -9, -93, -22, -118, -63, 44, 26, -127, 20]
//            , vbytes=[0, 0, 0, 0, 0, 29, -68, -44]
//            , rcmbytes=[8, -63, -106, 100, -66, -77, -3, -1, 68, -84, 55, 107, 28, -90, 57, 27, -72, 41, 86, -124, 32, 58, -126, -78, 20, 66, 71, 79, -66, 64, 36, 28]
//            , memobytes=[122, 101, 99, 32, 108, 105, 116, 101, 32, 116, 111, 32, 101, 109, 117, 108, 97, 116, 111, 114, 32, 49, 46, 51, 54, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}
//        2020-04-18 12:51:00.873 28316-28316/? D/CallGetMemo: memo=
//        2020-04-18 12:51:00.875 28316-28316/? D/TransactionDetailsActivity: CallGetMemo memo=

//      memobytes=[116, 101, 115, 116, 32, 109, 101, 109, 111, 32, 116, 111, 32, 115, 104, 105, 101, 108, 100, 101, 100, 32, 103, 117, 97, 114, 100, 97, 32, 102, 114, 111, 109, 32, 122, 101, 99, 119, 97, 108, 101, 116, 32, 108, 105, 116, 101, 32, 118, 49, 46, 48, 46, 53, 10, 82, 101, 112, 108, 121, 32, 116, 111, 58, 10, 122, 115, 49, 122, 115, 118, 119, 109, 114, 121, 57, 120, 53, 106, 101, 57, 57, 48, 103, 54, 110, 119, 113, 115, 102, 51, 109, 118, 118, 120, 108, 99, 107, 53, 118, 122, 100, 102, 118, 52, 99, 119, 115, 107, 112, 54, 55, 48, 116, 102, 122, 52, 107, 108, 112, 103, 54, 50, 50, 117, 109, 108, 55, 110, 112, 115, 52, 115, 99, 109, 110, 107, 113, 116, 108, 52, 112, 55, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}
//        [124, 0, 0, 0, -21, -41, -81, 95, -65, 126, -3, 10, 48, 60, -113, -21, 124, 0, 0, 0, 96, 12, 81, -8, 124, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -80, -48, 102, -16, 124, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -128, 60, -113, -21, 124, 0, 0, 0, 96, 12, 81, -8, 124, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 64, -47, 102, -16, 124, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -98, -72, -23, 124, 0, 0, 0, 0, 16, 0, 0, 0, 0, 0, 0, 11, 12, 0, 0, 0, 0, 0, 0, 78, -127, 1, 0, 0, 0, 0, 0, -122, 77, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 112, -47, 102, -16, 124, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, 32, -42, 102, -16, 124, 0, 0, 0, 112, -47, 102, -16, 124, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 97, 116, 97, 47, 109, 105, 115, 99, 47, 112, 114, 111, 102, 105, 108, 101, 115, 47, 99, 117, 114, 47, 49, 48, 47, 103, 117, 97, 114, 100, 97, 46, 115, 104, 105, 101, 108, 100, 101, 100, 47, 112, 114, 105, 109, 97, 114, 121, 46, 112, 114, 111, 102, 0, 97, 112, 107, 0, 0, 0, 0, 0, 64, -91, -79, 24, 125, 0, 0, 0, -1, -3, 0, 0, 124, 0, 0, 0, 64, -91, -79, 24, 125, 0, 0, 0, 122, 22, 0, 0, 106, 97, 114, 0, 64, -91, -79, 24, 125, 0, 0, 0, -1, -3, 0, 0, 112, 72, 50, 103, 64, -91, -79, 24, 125, 0, 0, 0, 94, 22, 0, 0, 125, 0, 0, 0, 36, 99, -81, 19, 12, 26, 25, 120, 72, 38, 50, -91, -82, 63, 15, -76, -27, 89, 85, -39, -44, 15, -54, -81, 23, -62, -119, 26, 8, 37, 14, 102, -4, -1, -1, -1, 3, 0, 0, 0, 4, -112, 6, 0, -12, 111, 9, -79, -22, -97, 120, -39, -1, -3, 24, 51, -1, -3, -118, 89, -77, 98, 73, 48, 7, 0, 0, 0, 0, 47, 97, 112, 112, -20, 9, -29, 124, 0, 0, 0, 112, -20, 9, -29, 124, 0, 0, 0, -128, -20, 9, -29, 124, 0, 0, 0, 14, 0, 0, 0, 0, 115, 97, 73, 96, -20, 9, -29, 124, 0, 0, 0, 96, -20, 9, -29]


//        val memobytes = byteArrayOf(116, 101, 115, 116, 32, 109, 101, 109, 111, 32, 116, 111, 32, 115, 104, 105, 101, 108, 100, 101, 100, 32, 103, 117, 97, 114, 100, 97, 32, 102, 114, 111, 109, 32, 122, 101, 99, 119, 97, 108, 101, 116, 32, 108, 105, 116, 101, 32, 118, 49, 46, 48, 46, 53, 10, 82, 101, 112, 108, 121, 32, 116, 111, 58, 10, 122, 115, 49, 122, 115, 118, 119, 109, 114, 121, 57, 120, 53, 106, 101, 57, 57, 48, 103, 54, 110, 119, 113, 115, 102, 51, 109, 118, 118, 120, 108, 99, 107, 53, 118, 122, 100, 102, 118, 52, 99, 119, 115, 107, 112, 54, 55, 48, 116, 102, 122, 52, 107, 108, 112, 103, 54, 50, 50, 117, 109, 108, 55, 110, 112, 115, 52, 115, 99, 109, 110, 107, 113, 116, 108, 52, 112, 55, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
        val memobytes = byteArrayOf(122, 101, 99, 32, 108, 105, 116, 101, 32, 116, 111, 32, 101, 109, 117, 108, 97, 116, 111, 114, 32, 49, 46, 51, 54, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
//        val memobytes = byteArrayOf(0, 0, 16, 66, 0, 0, 35, 68, 0, 0, 68, 67, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 66, 0, 0, 68, 67, 0, 0, 0, 66, 0, 0, 16, 66, 0, 0, 4, 66, 0, 0, 4, 66, 0, 0, 16, 66, 0, 0, 0, 66, 0, 0, 34, 68, 0, 0, 0, 66, 0, -64, 34, 68, 0, 0, 4, 66, 0, 0, 35, 68, 0, 0, 16, 66, 0, 0, 35, 68, 0, 0, 68, 67, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 64, -26, 110, 116, 127, 0, 0, 0, 0, 0, -120, 102, 127, 0, 0, 0, 0, 64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -128, 0, 0, 110, 103, 0, 0, 97, 112, 107, 0, -48, -66, -98, -95, 127, 0, 0, 0, 36, 0, 0, 0, 0, 0, 0, 0, -15, -100, -105, -95, 127, 0, 0, 0, 0, 0, 0, 0, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 99, 0, 0, 0, 1, 0, 0, 0, 127, 0, 0, 0, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, -80, -70, -103, 117, 127, 0, 0, 0, -114, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)


//        println("string bytes = ${String(memobytes, Charset.forName("UTF-16"))}")
        println("string bytes = ${String(memobytes)}")
    }

}