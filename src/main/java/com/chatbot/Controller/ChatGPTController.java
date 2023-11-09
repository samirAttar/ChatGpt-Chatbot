/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chatbot.Controller;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.completion.CompletionResult;
import com.theokanning.openai.service.OpenAiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 91976
 */
@RestController
public class ChatGPTController {

    @GetMapping("/getChat/{prompt}")
    public CompletionResult getPrompt(@PathVariable String prompt) {
        OpenAiService service = new OpenAiService("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");
        //ComplitionRequest com=new ComplitionRequest().builder.prompl
        CompletionRequest completionRequest = CompletionRequest.builder().prompt(prompt).model("davinci-002").echo(true).build();
        return service.createCompletion(completionRequest);

    }

}
