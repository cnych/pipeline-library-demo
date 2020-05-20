#!/usr/bin/env groovy
package com.qikqiak

class GlobalVars {
  static String foo = "bar"

  // 在 Pipeline 中可以引用这里的静态变量：
  // 
  // import com.qikqiak.GlobalVars
  // println GlobalVars.foo
}