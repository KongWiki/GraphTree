package com.wkk.hungarian;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Time: 2020/4/29上午9:03
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class HungarianTest {
    @Test
    public void testAlg(){
        Integer[][] values = {
                {67,98,65,95,79,82},
                {50,40,91,66,57,35},
                {61,74,85,112,39,79},
                {41,63,72,97,39,56},
                {56,55,83,91,59,50},
                {66,34,98,70,69,54}};





//				{67,98,65,205,79,82},
//				{50,40,91,66,57,145},
//				{171,74,85,112,39,79},
//				{41,173,72,97,39,56},
//				{56,55,193,91,59,50},
//				{66,34,98,70,179,54}};

        Hungarian hungarian1=new Hungarian(values);
    }

}
