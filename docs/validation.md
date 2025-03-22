# Rules for validating data

## Full name

### Rules

-   Any extra spaces at the beginning and end of the string is trimmed.
-   Full name can only contain Latin characters and any spaces in between.
-   Full name's length has to be between 4 and 20.

### Implementation

Regex used (after trimming):

```
^([a-zA-Z ]{4,20})$
```

## Password

### Rules

-   Any extra spaces at the beginning of the end of the string is trimmed.
-   Password only contain Latin characters, digits, and some special characters (!@#+-\_~=.,)
-   Password must contain at least one uppercase letter, one lowercase letter and one digit.
-   Password's length has to be between 8 and 32.

### Implementation

Regex used (after trimming):

```
^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[A-Za-z\d!@#+\-_=.,]{8,32}$
```

## Email

### Rules

-   Any extra spaces at the beginning or the end of the string is trimmed.
-   Email must conform to the [W3C HTML5 specification](https://html.spec.whatwg.org/multipage/input.html#valid-e-mail-address).

### Implementation

Regex used (after trimming):

```
^[a-zA-Z0-9.!#$%&'*+\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$
```
