# How to create your Secret config file for your token

Location:

```bash
cfg.TokenSecret
```

Source Code

    []: # Language: Java
    []: # Path: cfg/Secret

```java
package cfg;
public class TokenClass {
    private String token = "<your token>";
    public TokenClass() {
        this.token = token;
    }
    public String getToken() {
        return token;
    }
}

```