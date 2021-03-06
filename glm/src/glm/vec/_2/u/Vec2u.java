/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.u;

import glm.vec._2.i.Vec2i;
import glm.vec._3.Vec3;
import glm.vec._4.Vec4;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/**
 *
 * @author GBarbieri
 */
public class Vec2u extends operator {

    public Vec2u() {
        x = 0;
        y = 0;
    }

    public Vec2u(int i) {
        x = i;
        y = i;
    }

    public Vec2u(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vec2u(Vec2u v) {
        x = v.x;
        y = v.y;
    }

    public Vec2u(Vec2i v) {
        x = v.x;
        y = v.y;
    }

    public Vec2u(Vec3 v) {
        x = (int) v.x;
        y = (int) v.y;
    }

    public Vec2u(Vec4 v) {
        x = (int) v.x;
        y = (int) v.y;
    }

    public Vec2u set(int i) {
        x = i;
        y = i;
        return this;
    }

    public Vec2u set(float x, float y) {
        this.x = (int) x;
        this.y = (int) y;
        return this;
    }

    public Vec2u set(int[] ia) {
        x = ia[0];
        y = ia[1];
        return this;
    }

    public float[] toIa_() {
        return toIa(new float[2]);
    }

    public float[] toIa(float[] fa) {
        fa[0] = x;
        fa[1] = y;
        return fa;
    }

    public IntBuffer toDib_() {
        return toDib(ByteBuffer.allocateDirect(SIZE).order(ByteOrder.nativeOrder()).asIntBuffer());
    }

    public IntBuffer toDib(IntBuffer ib) {
        return toDib(ib, 0);
    }

    public IntBuffer toDib(IntBuffer ib, int index) {
        return ib
                .put(index + 0, x)
                .put(index + 1, y);
    }

    public ByteBuffer toDbb_() {
        return toDbb(ByteBuffer.allocateDirect(SIZE).order(ByteOrder.nativeOrder()));
    }

    public ByteBuffer toDbb(ByteBuffer bb) {
        return toDbb(bb, 0);
    }

    public ByteBuffer toDbb(ByteBuffer bb, int index) {
        return bb
                .putInt(index + 0 * Integer.BYTES, x)
                .putInt(index + 1 * Integer.BYTES, y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void print() {
        print("", true);
    }

    public void print(String title) {
        print(title, true);
    }

    public void print(boolean outStream) {
        print("", outStream);
    }

    public void print(String title, boolean outStream) {
        String res = title + "\n(" + x + ", " + y + ")";
        if (outStream) {
            System.out.print(res);
        } else {
            System.err.print(res);
        }
    }
}
