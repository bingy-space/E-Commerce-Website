export interface MyAppConfig {
    oidc: {
        clientId:'',
        issuer: '',
        redirectUri: 'http://localhost:4200/login/callback',
        scopes: ['openid','profile','email']
    }
}
