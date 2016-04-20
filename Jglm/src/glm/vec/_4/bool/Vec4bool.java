/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._4.bool;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/**
 *
 * @author elect
 */
public class Vec4bool {
    
    public static final int SIZE = 4 * Integer.BYTES;

    public boolean x, y, z, w;
    
    public IntBuffer toDib_() {
        return toDib(ByteBuffer.allocateDirect(SIZE).order(ByteOrder.nativeOrder()).asIntBuffer());
    }

    public IntBuffer toDib(IntBuffer ib) {
        return toDib(ib, 0);
    }

    public IntBuffer toDib(IntBuffer ib, int index) {
        return ib
                .put(index + 0, x ? 1 : 0)
                .put(index + 1, y ? 1 : 0)
                .put(index + 2, z ? 1 : 0)
                .put(index + 3, w ? 1 : 0);
    }

    public ByteBuffer toDbb_() {
        return toDbb(ByteBuffer.allocateDirect(SIZE).order(ByteOrder.nativeOrder()));
    }

    public ByteBuffer toDbb(ByteBuffer bb) {
        return toDbb(bb, 0);
    }

    public ByteBuffer toDbb(ByteBuffer bb, int index) {
        return bb
                .putInt(index + 0 * Integer.BYTES, x ? 1 : 0)
                .putInt(index + 1 * Integer.BYTES, y ? 1 : 0)
                .putInt(index + 2 * Integer.BYTES, z ? 1 : 0)
                .putInt(index + 3 * Integer.BYTES, w ? 1 : 0);
    }
}
