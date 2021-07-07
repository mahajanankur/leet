/**
 * 
 */
package com.sb.leet.easy.string;

import java.util.Stack;

/**
 * @author ankur
 * @crated 06-Jul-2021
 * 
 *         https://leetcode.com/problems/valid-parentheses/
 * 
 *         s consists of parentheses only '()[]{}'
 * 
 *         Input: s = "()" Output: true
 * 
 *         Input: s = "()[]{}" Output: true
 * 
 *         Input: s = "(]" Output: false
 * 
 *         Input: s = "([)]" Output: false
 * 
 *         Input: s = "{[]}" Output: true
 * 
 *         Edge cases : String of 1 char | cases like (( check for stack length
 *         to empty. cases like }{ check for try catch while pop an element
 * 
 */
public class ValidParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String paran = "()";
		boolean valid = isValid(paran);
		System.out.println(valid);
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		if (s.length() == 1) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			} else {
				try {
					char pop = stack.pop();
					switch (s.charAt(i)) {
					case ')':
						if (pop != '(') {
							return false;
						}
						break;
					case '}':
						if (pop != '{') {
							return false;
						}
						break;
					case ']':
						if (pop != '[') {
							return false;
						}
						break;
					}
				} catch (Exception e) {
					return false;
				}
			}
		}
		if (stack.size() != 0) {
			return false;
		}
		return true;
	}

}
